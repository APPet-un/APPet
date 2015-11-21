package auth

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Service)
class ServiceSpec extends Specification {

	//Service s, s1

	def setup() {
    	//s= new Service(name:"masajes", description:"qwert")
    	//s2= new Service(name:"peluqueria", description:"importante")
    }

    def cleanup() {
    }

    /*def "validacion de creacion"()
    {
        expect:
    	s.name== "masajes"
    	s.description== "qwert"
    	s2.name== "peluqueria"
    	s2.description== "importante"
    }*/

    void "test something"() {
    }
}
