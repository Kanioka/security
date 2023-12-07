package secure.app

class BootStrap {

    def init = { servletContext ->
        {
            Role.withTransaction {
                def role = Role.findOrSaveWhere(authority: 'ROLE_ADMIN')
                Role.findOrSaveWhere(authority: 'ROLE_USER')
                def user = User.findOrSaveWhere(username: 'test', password: 'test')
                UserRole.create(user, role, true)

            }

        }
    }
    def destroy = {
    }
}
