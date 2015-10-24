package appet.loca

class User
{
	int id
	String firstName
	String lastName
	int telephone
	int movilPhone
	String address
	boolean registryType	//True -> Veterinario // False -> Natural
	boolean type	//True -> Afiliado a Veterinaria // False -> Sin Afiliacion

    static constraints =
    {
    	id (unique:true, blank:false, min:1)
    	firstName (blank:false, minSize:3)
    	lastName (blank:false, minSize:3)
    	telephone (blank:false, size:8)
    	movilPhone (blank:true, size:10)
    	address (blank:true, minSize:6)
    	registryType (blank:false)
    	type (blank:false)
    }
}