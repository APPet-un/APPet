package appet.loca

class VaccinationRecord
{
	String type
	String comments
	Date administerDate
	Date expirationDate

    static constraints =
    {
    	type (blank:false, minSize:4)
    	comments (blank:true)
    	administerDate (blank:false)
    	expirationDate (blank:false)
    }
}