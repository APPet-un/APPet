package auth

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(User)
class UserSpec extends Specification {

	User u1, u2

    def setup() {
    	u1= new User(firstName:"", lastName:"", telephone:123456, movilPhone:310123456, address:"", emailUser:"")
    	u2= new User(firstName:"Sebastian", lastName:"Munoz", telephone:7654321, movilPhone:3101234567, address:"Calle falsa 123", emailUser:"sebastian@dominio.com")
    }

    def cleanup() {
    }

    def "validacion de nombres"()
    {
        expect:
    	//u1.firstName== ""
    	//u1.lastName== ""
    	u2.firstName== "Sebastian"
    	u2.lastName== "Munoz"
    }

    def "validacion de telefonos"()
    {
        expect:
    	//u1.telephone== 123456
    	//u1.movilPhone== 310123456
    	u2.telephone== 7654321
    	//u2.movilPhone== 3101234567
    }

    def "validacion de direcciones"()
    {
        expect:
    	//u1.address== ""
    	//u1.emailUser== ""
    	u2.address== "Calle falsa 123"
    	u2.emailUser== "sebastian@dominio.com"
    }

    void "test something"() {
    }
}
