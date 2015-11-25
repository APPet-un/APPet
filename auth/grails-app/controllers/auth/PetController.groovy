package auth
import auth.Pet
import auth.User
import grails.rest.RestfulController


class PetController extends RestfulController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
    static responseFormats = ['json']

    def index(Integer max) {
        String email = params.email
        def query = User.where {
            emailUser == email
        }
        User user = query.find()
        respond user.pets

    }

    def show(Pet petInstance) {
        respond petInstance
    }

    def create() {
        respond new Pet(params)
    }

}