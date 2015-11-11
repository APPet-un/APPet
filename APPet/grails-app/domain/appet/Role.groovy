package appet

class Role {

    String authority

    static mapping ={
        cache true
    }
    static constraints = {
        authority blan: false, unique: true
    }
}
