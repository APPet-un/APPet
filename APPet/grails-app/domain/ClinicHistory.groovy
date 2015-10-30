package appet.loca

class ClinicHistory
{
	//int fileCode
	Date date
	String doctor
	String disease
	String treatment
	String surgeries
	String observations

	static belongsTo = [pet: Pet]
	static hasMany = [laboratoryTests: LaboratoryTest, historyClinicFiles: HistoryClinicFile ]
	//Esta clase tiene una relacion algo extraña no se como representarla en groovy

    static constraints =
    {
    	//fileCode (unique:true, blank:false, min:1)
    	date (blank:false)
    	doctor (blank:false, minSize:3)
    	disease (blank:false, minSize:5)
    	treatment (blank:false, minSize:5)
    	surgeries (blank:false, minSize:5)
    	observations (blank:false, size:5..10000)
    }
	static mapping = {
		id generator: 'increment'//, name: "clinic_history_id"
		//id name: 'clinic_history_id', type: 'integer'
	}
}