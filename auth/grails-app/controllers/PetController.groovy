import auth.Pet
import auth.User
import grails.converters.JSON
import grails.converters.XML
import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class PetController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
    static responseFormats = ['json','xml']

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

    def list = {
        def pets = [petList: Pet.list(params)]
        withFormat {
            json { render pets as JSON }
            xml { render pets as XML }
        }
    }
    //Searching per specie
    def findPerSpecie = {
        String specie = params.key
        def pets = Pet.findBySpecies(specie)
        withFormat {
            json { render pets as JSON }
            xml { render pets as XML }
        }
    }
    //Searching per specie and gender
    def findPerSpecieGender = {
        def keys = params.keySet()
        String spe = params.spec
        String gen = params.gend
        def query = Pet.where {
            (species == spe && gender == gen)
        }
        Pet pets = query.find()
        withFormat {
            json { render pets as JSON }
            xml { render pets as XML }
        }
    }

    def findPerOwner = {
        String own = params.key
        def pets = Pet.findByOwner(own)
        withFormat {
            json { render pets as JSON }
            xml { render pets as XML }
        }
    }
    @Transactional
    def save(Pet petInstance) {
        if (petInstance == null) {
            notFound()
            return
        }

        if (petInstance.hasErrors()) {
            respond petInstance.errors, view: 'create'
            return
        }

        petInstance.save flush: true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'pet.label', default: 'Pet'), petInstance.id])
                redirect petInstance
            }
            '*' { respond petInstance, [status: CREATED] }
        }
    }

    def edit(Pet petInstance) {
        respond petInstance
    }

    @Transactional
    def update(Pet petInstance) {
        if (petInstance == null) {
            notFound()
            return
        }

        if (petInstance.hasErrors()) {
            respond petInstance.errors, view: 'edit'
            return
        }

        petInstance.save flush: true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Pet.label', default: 'Pet'), petInstance.id])
                redirect petInstance
            }
            '*' { respond petInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Pet petInstance) {

        if (petInstance == null) {
            notFound()
            return
        }

        petInstance.delete flush: true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Pet.label', default: 'Pet'), petInstance.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'pet.label', default: 'Pet'), params.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NOT_FOUND }
        }
    }
}
