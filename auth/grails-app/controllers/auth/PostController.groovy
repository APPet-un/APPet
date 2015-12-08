package auth

import grails.rest.RestfulController

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional


class PostController extends RestfulController<Post>{


    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE", show:"GET"]

    static responseFormats = ['json']

    PostController(){
        super(Post)
    }

    @Override
    @Transactional
    def show(){
        index(10)
    }
}
