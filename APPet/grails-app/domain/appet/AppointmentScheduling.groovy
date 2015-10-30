package appet

class AppointmentScheduling
{
	String petName
	String doctor
	Date date 		//Aca debe contener la hora de la cita

	static belongsTo =[pet: Pet]

	static constraints =
    {
    	petName (blank:false, minSize:3)
    	doctor (blank:false, minSize:7)
    	date (blank:false)
    }

	static mapping = {
		id generator: 'increment'//, name: 'appointed_id'
		//id column: 'appointed_id', type: 'integer'
	}
}