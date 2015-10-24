package appet.loca

class AppointmentScheduling
{
	String petName
	String doctor
	Date date 		//Aca debe contener la hora de la cita

    static constraints =
    {
    	petName (blank:false, minSize:1)
    	doctor (blank:false, minSize:7)
    	date (blank:false)
    }
}