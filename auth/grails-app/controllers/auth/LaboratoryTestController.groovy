package auth


import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class LaboratoryTestController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond LaboratoryTest.list(params), model: [laboratoryTestInstanceCount: LaboratoryTest.count()]
    }

    def show(LaboratoryTest laboratoryTestInstance) {
        respond laboratoryTestInstance
    }

    def create() {
        respond new LaboratoryTest(params)
    }

    @Transactional
    def save(LaboratoryTest laboratoryTestInstance) {
        if (laboratoryTestInstance == null) {
            notFound()
            return
        }

        if (laboratoryTestInstance.hasErrors()) {
            respond laboratoryTestInstance.errors, view: 'create'
            return
        }

        laboratoryTestInstance.save flush: true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'laboratoryTest.label', default: 'LaboratoryTest'), laboratoryTestInstance.id])
                redirect laboratoryTestInstance
            }
            '*' { respond laboratoryTestInstance, [status: CREATED] }
        }
    }

    def edit(LaboratoryTest laboratoryTestInstance) {
        respond laboratoryTestInstance
    }

    @Transactional
    def update(LaboratoryTest laboratoryTestInstance) {
        if (laboratoryTestInstance == null) {
            notFound()
            return
        }

        if (laboratoryTestInstance.hasErrors()) {
            respond laboratoryTestInstance.errors, view: 'edit'
            return
        }

        laboratoryTestInstance.save flush: true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'LaboratoryTest.label', default: 'LaboratoryTest'), laboratoryTestInstance.id])
                redirect laboratoryTestInstance
            }
            '*' { respond laboratoryTestInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(LaboratoryTest laboratoryTestInstance) {

        if (laboratoryTestInstance == null) {
            notFound()
            return
        }

        laboratoryTestInstance.delete flush: true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'LaboratoryTest.label', default: 'LaboratoryTest'), laboratoryTestInstance.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'laboratoryTest.label', default: 'LaboratoryTest'), params.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NOT_FOUND }
        }
    }
}
