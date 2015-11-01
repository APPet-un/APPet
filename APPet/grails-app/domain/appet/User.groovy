package appet

import grails.rest.Resource


@Resource(uri='/user')
class User
{
	String firstName
	String lastName
	String address
	int telephone
	int mobilPhone
	String emailUser

    static constraints = {
    	firstName (blank:false, minSize:3)
    	lastName (blank:false, minSize:3)
    	telephone (blank:false, size:8)
    	mobilPhone (blank:true, size:10)
    	address (blank:true, minSize:6)
    	emailUser(blank: false,email: true)
    }
	static mapping = {
		id generator: 'increment'
		//id name: 'pet_id', type: 'integer'
	}
}