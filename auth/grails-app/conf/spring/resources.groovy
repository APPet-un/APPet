// Place your Spring DSL code here
import grails.rest.render.json.JsonCollectionRenderer
import grails.rest.render.xml.*
import grails.rest.render.json.JsonRenderer
import auth.User

beans = {

    nonAuthFilter(NonAuthenticationFilter)

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
