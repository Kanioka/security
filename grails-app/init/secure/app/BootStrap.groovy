package secure.app

class BootStrap {

    def init = { servletContext ->
        {
            Role.withTransaction {
                def role = new Role(authority: 'ROLE_ADMIN')
                role.save()
                def role1 = new Role(authority: "ROLE_USER")
                role1.save()
                def user = new User(username: "blaise", password: "blaisette")
                user.save()
                def user1 = new User(username: "blaisette", password: "blaisette")
                user1.save()
                def userRole = new UserRole(user: user, role: role)
                userRole.save()
                def userRole1 = new UserRole(user: user1, role: role1)
                userRole1.save()
            }

        }
    }
    def destroy = {
    }
}
