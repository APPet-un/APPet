package appet

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(LabFile)
class LabFileSpec extends Specification {

	LabFile lb, lb2

	def setup() {
    	lb= new LabFile(date:22-1-2011, name:"a")
    	lb2= new LabFile(date:10-2-2013, name:"importante")
    }

    def cleanup() {
    }

    def "validacion de creacion"()
    {
        expect:
    	lb.date!= null
    	lb.name== "a"
    	lb2.date!= null
    	lb2.name== "importante"
    }

    void "test something"() {
    }
}
