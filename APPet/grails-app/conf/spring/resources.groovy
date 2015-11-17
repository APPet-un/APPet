// Place your Spring DSL code here

import grails.rest.render.json.JsonCollectionRenderer
import grails.rest.render.xml.*
import grails.rest.render.json.JsonRenderer
import appet.User
beans = {
    userXmlRenderer(XmlRenderer, User) {
        excludes = ['class']
    }
    userJSONRenderer(JsonRenderer, User) {
        excludes = ['class']
    }
    /*userXmlCollectionRenderer(XmlCollectionRenderer,User) {
        excludes = ['class']
    }
    userJSONCollectionRenderer(JsonCollectionRenderer, User) {
        excludes = ['class']
    }*/
}
