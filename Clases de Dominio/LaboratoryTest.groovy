package appet.loca

class Laboratory
{
	Date date
	String diagnostic
	static hasMany = [labFiles: LabFile]

	//Esta clase tiene una relacion tambien estraña como historia clinica

    static constraints =
    {
    	date (blank:false)
    	diagnostic (blank:false, size:5..10000)
    }
    static mapping = {
		id generator: 'increment'//, name: 'laboratory_test_id', type: 'integer'
	}
}
