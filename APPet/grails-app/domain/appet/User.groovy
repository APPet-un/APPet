package appet

class User {

	//transient springSecurityService //TODO

	String firstName
	String lastName
	String address
	int telephone
	int mobilPhone
	String emailUser
	String password

    static constraints = {
    	firstName (blank:false, minSize:3)
    	lastName (blank:false, minSize:3)
    	telephone (blank:false, size:8)
    	mobilPhone (blank:true, size:10)
    	address (blank:true, minSize:6)
    	emailUser(blank: false,email: true)
		password(blank: false)
    }
	static mapping = {
		id generator: 'increment'
		password column: 'password'
		//id name: 'pet_id', type: 'integer'
	}

	def beforeInsert(){
		encodePassword()
	}

	def beforeUpdate(){
		if(isDirty('password'))
			encodePassword()
	}

	protected void encodePassword(){
		//password = springSecurityService.encodePassword(password) //TODO
	}
	Set<User>getAuthorities(){
		//UserRole.findAllByUser(this).collect{it.role} as Set  //TODO
	}

}