package appet.loca

class User
{
	String firstName
	String lastName
	int telephone
	int movilPhone
	String address
	String emailUser
	
    static constraints =
    {
    	firstName (blank:false, minSize:3)
    	lastName (blank:false, minSize:3)
    	telephone (blank:false, size:8)
    	movilPhone (blank:true, size:10)
    	address (blank:true, minSize:6)
    	emailUser(blank: false,email: true)

    }
    static mapping = {
		id generator: 'increment'
		//id name: 'pet_id', type: 'integer'
	}
}
