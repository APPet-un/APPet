package auth
import auth.User
import grails.converters.JSON
import grails.converters.XML
import grails.rest.RestfulController
import grails.transaction.Transactional
import org.codehaus.groovy.grails.web.servlet.HttpHeaders

import static org.springframework.http.HttpStatus.CREATED
import static org.springframework.http.HttpStatus.NOT_FOUND
import static org.springframework.http.HttpStatus.NO_CONTENT
import static org.springframework.http.HttpStatus.OK

class UserController extends RestfulController<User> {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE", show: "GET"]

    static responseFormats = ['json']

    UserController() {
        super(User)
    }

    @Override
    @Transactional
    def show() {
        String email = params.email
        print(email)
        respond (User.findByEmailUser(email))
    }
    @Override
    @Transactional
    def update() {
        if(handleReadOnly()) {
            return
        }

        User instance = User.findByEmailUser(params.email)
        if (instance == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        instance.properties = getObjectToBind()

        if (instance.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond instance.errors, view:'edit' // STATUS CODE 422
            return
        }

        instance.save flush:true
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: "${resourceClassName}.label".toString(), default: resourceClassName), instance.id])
                redirect instance
            }
            '*'{
                response.addHeader(HttpHeaders.LOCATION,
                        g.createLink(
                                resource: this.controllerName, action: 'show',id: instance.id, absolute: true,
                                namespace: hasProperty('namespace') ? this.namespace : null ))
                respond instance, [status: OK]
            }
        }
    }
}