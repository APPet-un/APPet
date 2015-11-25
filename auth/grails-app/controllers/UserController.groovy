import auth.User
import grails.converters.JSON
import grails.converters.XML
import grails.rest.RestfulController
import grails.transaction.Transactional
import static org.springframework.http.HttpStatus.CREATED
import static org.springframework.http.HttpStatus.NOT_FOUND
import static org.springframework.http.HttpStatus.NO_CONTENT
import static org.springframework.http.HttpStatus.OK

class UserController extends RestfulController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE", findPets: "GET"]

    static responseFormats = ['json', 'xml']

    UserController() {
        super(User)
    }

    @Override
    def index(Integer max) {
        String email = params.email
        respond User.findByEmailUser(email)
    }

}