package secure.app

import grails.plugin.springsecurity.annotation.Secured

@Secured('permitAll')
class CreateUserController {

    def create() {

        println(params)

        User.withTransaction {
            def user=new User(username: params.username,password:params.password,email:params.email)
            user.save(flush:true)
            redirect  (controller:'product' , action:'index' )
        }

    }
}
