package appet

import grails.rest.RestfulController


class VeterinaryController extends RestfulController{

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
    static responseFormats = ['json','xml']
    VeterinaryController(){
        super(Veterinary)
    }
}
