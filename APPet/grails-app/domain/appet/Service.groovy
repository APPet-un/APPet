package appet

class Service
{
	String name
	String description

	//static belongsTo = [veterinary: appet.Veterinary]

    static constraints =
    {
    	name (unique:true, blank:false, minSize:3)
    	description (blank:false, size:5..1000)
    }
	static mapping = {
		id generator: 'increment'//, name: 'service_id', type: 'integer'
	}
}