package appet

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(ClinicHistory)
class ClinicHistorySpec extends Specification {

	ClinicHistory ch1

    def setup() {
    	ch1= new ClinicHistory(date:15-5-2012, doctor:"Pedro", disease:"rabia", treatment:"qwerasdf", surgeries:"qwerasdf", observations:"qwerasdf")
    	
    }

    def cleanup() {
    }

    def "validacion de nombres"()
    {
        expect:
        ch1.date!= null
    	ch1.doctor== "Pedro"
    	ch1.disease== "rabia"
    	ch1.treatment== "qwerasdf"
    	ch1.surgeries== "qwerasdf"
    	ch1.observations== "qwerasdf"
        //ch1.treatment== ""
        //ch1.surgeries== ""
        //ch1.observations== ""
    }

    void "test something"() {
    }
}
