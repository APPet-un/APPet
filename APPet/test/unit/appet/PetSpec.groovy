package appet

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Pet)
class PetSpec extends Specification {

	Pet p

    def setup() {
    	p= new Pet(name:"pepe", bornDate:31-10-2015, gender:"M", species:"Perro", breed:"chanda", color:"rojo", signals:"qwert", microchip:false)
    }

    def cleanup() {
    }

    def "verificacion de creacion"()
    {
    	expect:
    	p.name== "pepe"
    	p.bornDate!= null
    	//p.gender== "D"
    	p.gender== "M"
    	p.species== "Perro"
    	p.breed== "chanda"
    	p.color== "rojo"
    	p.signals== "qwert"
    	p.microchip== false
    }

    void "test something"() {
    }
}
