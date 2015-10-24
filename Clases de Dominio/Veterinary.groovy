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
    	id (unique:true, blank:false, min:1)
    	name (blank:false, minSize:2)
    	address (blank:false, minSize:6)
    	webPage (url:true)
    	telephone (blank:false, size:8)
    	movilPhone (blank:true, size:10)
    }
}