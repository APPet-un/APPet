package appet

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Client)
class ClientSpec extends Specification {

	//Client c1, c2, c3, c4

    def setup() {
    	//c1= new Client()
    	//c2= new Client()
    	//c4= new Client()
    	//c3= new Client()
    }

    def cleanup() {
    }

    /*def "Secuencia en id"()
    {
        expect:
    	c1.id== 1
    	c2.id== 2
    	c3.id== 4
    	c4.id== 3
    }*/

    void "test something"() {
    }
}
