package secure.app

import grails.gorm.transactions.Transactional
import grails.plugin.springsecurity.SpringSecurityUtils
import grails.plugin.springsecurity.userdetails.GrailsUserDetailsService
import grails.plugin.springsecurity.userdetails.NoStackUsernameNotFoundException
import org.springframework.dao.DataAccessException
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UsernameNotFoundException

@Transactional
class CustomUserDetailsService implements GrailsUserDetailsService {
    static final List NO_ROLES = [new SimpleGrantedAuthority(SpringSecurityUtils.NO_ROLE)]

    @Override
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = User.findByUsername(username)
        if (!user) throw new NoStackUsernameNotFoundException()

        def roles = user.authorities

        def authorities = roles.collect {
            new SimpleGrantedAuthority(it.authority)
        }

        return new CustomUserDetails(user.username, user.password, user.enabled,
                !user.accountExpired, !user.passwordExpired,
                !user.accountLocked, authorities ?: NO_ROLES, user.id,
                user.email)
    }
    @Override
    UserDetails loadUserByUsername(String username, boolean loadRoles) throws UsernameNotFoundException, DataAccessException {
        return loadUserByUsername(username)
    }
    def serviceMethod() {

    }
}
