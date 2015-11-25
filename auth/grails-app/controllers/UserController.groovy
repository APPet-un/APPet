import auth.User
import grails.converters.JSON
import grails.rest.RestfulController

class UserController extends RestfulController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE", getemail:"GET"]

    static responseFormats = ['json', 'xml']

    UserController() {
        super(User)
    }

    def search() {
        String email = params.email
        respond User.findByEmailUser(email)

        /*
    @Override
    protected User queryForResource(Serializable email) {
        User u = User.findByEmailUser(email)

    }*/
    }
    @Override
    def index(Integer max) {
        String email = params.email
        respond User.findByEmailUser(email)
    }

}