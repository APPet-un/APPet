package auth

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(LaboratoryTest)
class LaboratoryTestSpec extends Specification {

	LaboratoryTest lt, lt2

	def setup() {
    	lt= new LaboratoryTest(date:22-1-2011, diagnostic:"aasddsa")
    	lt2= new LaboratoryTest(date:10-2-2013, diagnostic:"importante")
    }

    def cleanup() {
    }

    def "validacion de creacion"()
    {
        expect:
    	lt.date!= null
    	lt.diagnostic== "aasddsa"
    	lt2.date!= null
    	lt2.diagnostic== "importante"
    }

    void "test something"() {
    }
}
