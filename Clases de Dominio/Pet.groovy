package appet.loca

class Pet
{
	int id
	String name
	Date bornDate
	char gender
	String species
	String breed
	String color
	String signals
	boolean microchip
	File photo
	
    static hasOne = [clinicHistory: ClinicHistory]
    static belongsTo = [owner: Client]

    static constraints =
    {
    	id (unique:true, blank:false, min:1)
    	name (blank:false, minSize:1)
    	bornDate (blank:false)
    	gender (blank:false, inList: ["F","M"])
    	gender (blank:false)
    	species (blank:false, minSize:4)
    	breed (blank:false, minSize:5)
    	color (blank:false, minSize:3)
    	signals (blank:true)
    	microchip (blank:false)
    }
    static mapping = {
        id generator: 'increment'
        //id name: 'pet_id', type: 'integer'
    }
}
