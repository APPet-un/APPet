package auth
import grails.rest.Resource


@Resource(uri='/client')
class Client extends User{

    int vetId
    static hasMany = [pets: Pet]

    static constraints = {

    }

}
