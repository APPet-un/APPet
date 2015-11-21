package auth

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(HistoryClinicFile)
class HistoryClinicFileSpec extends Specification {

	HistoryClinicFile hcf, hcf2

    def setup() {
    	hcf= new HistoryClinicFile(date:22-1-2011, name:"a")
    	hcf2= new HistoryClinicFile(date:10-2-2013, name:"importante")
    }

    def cleanup() {
    }

    def "validacion de creacion"()
    {
        expect:
    	hcf.date!= null
    	hcf.name== "a"
    	hcf2.date!= null
    	hcf2.name== "importante"
    }

    void "test something"() {
    }
}
