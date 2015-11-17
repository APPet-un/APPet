package appet

import grails.rest.RestfulController

class PetController extends RestfulController{
    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    static responseFormats = ['json','xml']

    PetController() {
        super(Pet)
    }


}
