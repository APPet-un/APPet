package auth

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Veterinary)
class VeterinarySpec extends Specification {

	Veterinary v

    def setup() {
    	v= new Veterinary(name:"matasanos", address:"Calle falsa 123", webPage:"www.matasanos.com", telephone:1234567, movilPhone:110234567)
    }

    def cleanup() {
    }

    def "validacion de creacion"()
    {
    	expect:
    	v.name== "matasanos"
    	v.address== "Calle falsa 123"
    	v.webPage== "www.matasanos.com"
    	v.telephone== 1234567
    	//v.movilPhone== 1101234567
    }

    void "test something"() {
    }
}
