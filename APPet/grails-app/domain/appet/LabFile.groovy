package appet
import grails.rest.Resource


@Resource(uri='/labfile')
class LabFile
{
	//int code
	Date date
	String name

	//Esta clase se relaciona con Laboratorio de alguna manera

    static constraints =
    {
    	//code (unique:true, blank:false, min:1)
    	date (blank:false)
    	name (blank:false, minSize:5)
    }

	static mapping = {
		id generator: 'increment'//, name: 'lab_file_id', type: 'integer'
	}
}