package appet.loca

class VaccinationRecord
{
	ArrayList<String> vaccinationTypes
	String comments
	Date administerDate
	Date expirationDate
	
	static belongsTo = [pet: Pet]

    static constraints =
    {
    	comments (blank:true)
    	administerDate (blank:false)
    	expirationDate (blank:false)
    	
    	vaccinationTypes validator:{
			vaccinationTypes.each {
				if (it != "")
					return ['Vacuna invalida']
			}
		}
    }
    static mapping = {
		id generator: 'increment'//, name: 'vaccination_record_id'
		//id name: 'pet_id', type: 'integer'
	}
}
