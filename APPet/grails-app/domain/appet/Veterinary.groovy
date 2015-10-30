package appet

class Veterinary
{

	String name
	String address
	String webPage
	int telephone
	int movilPhone

	static hasMany= [services: Service, users: User, clinicHistories: ClinicHistory]

    static constraints =
    {
    	name (blank:false, minSize:2)
    	address (blank:false, minSize:6)
    	webPage (url:true)
    	telephone (blank:false, size:8)
    	movilPhone (blank:true, size:10)
    }
	static mapping = {
		id generator: 'increment'//, name: 'veterinary_id'
		//id name: 'pet_id', type: 'integer'
	}
}