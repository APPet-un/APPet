import auth.User
import grails.rest.RestfulController

class UserController extends RestfulController{

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    static responseFormats = ['json','xml']

    UserController() {
        super(User)
    }
}
