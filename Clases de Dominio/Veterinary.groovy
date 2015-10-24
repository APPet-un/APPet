package appet.loca

class Veterinary
{
	int id
	String name
	String address
	String webPage
	int telephone
	int movilPhone
	static hasMany= [services: Services]

    static constraints =
    {
    	
    }
}