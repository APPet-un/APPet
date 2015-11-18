package auth

class User {

    transient springSecurityService

    String firstName
    String lastName
    String address
    int telephone
    int mobilPhone
    String emailUser
    String username
    String password
    boolean enabled = true
    boolean accountExpired
    boolean accountLocked
    boolean passwordExpired

    static transients = ['springSecurityService']

    static constraints = {
        firstName (blank:false, minSize:3)
        lastName (blank:false, minSize:3)
        telephone (blank:true, size:8)
        mobilPhone (blank:true, size:10)
        address (blank:true, nullable: true )
        emailUser(blank: false,email: true)
        username blank: false, unique: true
        password blank: false
    }

    static mapping = {
        id generator: 'increment'
        password column: '`password`'
    }

    Set<Role> getAuthorities() {
        UserRole.findAllByUser(this).collect { it.role } as Set
    }

    def beforeInsert() {
        encodePassword()
    }

    def beforeUpdate() {
        if (isDirty('password')) {
            encodePassword()
        }
    }

    protected void encodePassword() {
        password = springSecurityService.encodePassword(password)
    }
}