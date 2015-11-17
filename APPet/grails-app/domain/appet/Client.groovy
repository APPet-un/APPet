package appet

class Client extends User{

    int vetId
    static hasMany = [pets: Pet]

    static constraints = {

    }
}
