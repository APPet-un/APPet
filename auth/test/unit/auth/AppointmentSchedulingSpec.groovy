package auth

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(AppointmentScheduling)
class AppointmentSchedulingSpec extends Specification {

	AppointmentScheduling cita1, cita2, cita3, cita4, cita5, cita6

    def setup() {
    	cita1= new AppointmentScheduling (petName:"", doctor: "Sanchez", date:21-8-2016)
    	cita2= new AppointmentScheduling (petName:"pepe", doctor: "", date:21-8-2016)
    	cita3= new AppointmentScheduling (petName:"rex", doctor: "Sanchez", date:null)
    	cita4= new AppointmentScheduling (petName:"t", doctor: "Sanchez", date:21-8-2016)
    	cita5= new AppointmentScheduling (petName:"chango", doctor: "Moca", date:21-8-2016)
    	cita6= new AppointmentScheduling (petName:"godzilla", doctor: "Sanchez", date:21-8-2016)
    }

    def cleanup() {
    }

    def "name pet null"()
    {
    	expect:
    	cita1.petName == null
    	cita2.petName != null
    	cita3.petName != null
    	cita4.petName != null
    	cita5.petName != null
    	cita6.petName != null
    }

    def "name doctor null"()
    {
    	expect:
    	cita1.doctor != null
    	cita2.doctor == null
    	cita3.doctor != null
    	cita4.doctor != null
    	cita5.doctor != null
    	cita6.doctor != null
    }

    def "date null"()
    {
    	expect:
    	cita1.date != null
    	cita2.date != null
    	cita3.date == null
    	cita4.date != null
    	cita5.date != null
    	cita6.date != null
    }

    void "test something"() {

    }
}
