package appet

import grails.rest.RestfulController

class ClientController extends RestfulController{

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
    static responseFormats = ['json','xml']

    ClientController() {
        super(Client)
    }

}
