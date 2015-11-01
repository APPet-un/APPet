package appet
import grails.rest.Resource


@Resource(uri='/historyclinicfile')
class HistoryClinicFile
{
	//int code
	Date date
	String name

	//Esta clase se relaciona con hstoria clinica de alguna manera

    static constraints =
    {
    	//code (unique:true, blank:false, min:1)
    	date (blank:false)
    	name (blank:false, minSize:5)
    }
	static mapping = {
		id generator: 'increment'//, name: 'history_file_id', type: 'integer'
	}
}