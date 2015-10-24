package appet.loca

class ClinicHistory
{
	int fileCode
	Date date
	String medic
	String disease
	String treatment
	String surgeries
	String observations

	//Esta clase tiene una relacion algo estraña no se como representarla en groovy

    static constraints =
    {
    	fileCode (unique:true, blank:false, min:1)
    	date (blank:false)
    	medic (blank:false, minSize:3)
    	disease (blank:false, minSize:5)
    	treatment (blank:false, minSize:5)
    	surgeries (blank:false, minSize:5)
    	observations (blank:false, size:5..10000)
    }
}