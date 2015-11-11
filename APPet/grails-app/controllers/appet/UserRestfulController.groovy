package appet

import grails.rest.RestfulController

class UserRestfulController extends RestfulController{

    static responseFormats = ['json']

    UserRestfulController(){
        super(User)
    }
}

