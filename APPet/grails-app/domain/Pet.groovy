package appet.loca

class Pet
{
	String name
	Date bornDate
	char gender
	String species
	String breed
	String color
	String signals
	boolean microchip
	HistoryClinicFile photo

	static hasOne = [clinicHistory: ClinicHistory,vaccionationRecord: VaccinationRecord]
	static belongsTo = [owner: Client]

    static constraints =
    {
    	name (blank:false, minSize:3)
    	bornDate (blank:false)
    	gender (blank:false, inList: ["F","M"])
    	species (blank:false, minSize:4)
		//signals(blank: true)
    	breed (blank:false, minSize:5)
    	color (blank:false, minSize:3)
    	microchip (blank:false)
    }
	static mapping = {
		id generator: 'increment'//, name: 'pet_id'
		//id name: 'pet_id', type: 'integer'
	}
}