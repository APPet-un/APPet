package auth
import grails.rest.Resource


class Client extends User{

    int vetId
    static hasMany = [pets: Pet]

    static constraints = {

    }

}
