package auth
import grails.rest.Resource

@Resource(uri='/pet')
class Pet
{
    String name
    Date bornDate
    char gender
    String species
    String breed
    String color
    String signals
    boolean microchip
    HistoryClinicFile clinicFile
    String urlImage


    //static hasOne = [clinicHistory: ClinicHistory,vaccionationRecord: VaccinationRecord]
    static belongsTo = [owner: User]

    static constraints = {
        name (blank:false, minSize:3)
        bornDate (blank:false)
        gender (blank:false)
        species (blank:false, minSize:4)
        signals(nullable: true)
        breed (blank:false, minSize:5)
        color (blank:false, minSize:3)
        microchip (blank:false)
        clinicFile(nullable: true)
        urlImage(nullable: true)
     }
    static mapping = {
        id generator: 'increment'//, name: 'pet_id'
        //id name: 'pet_id', type: 'integer'
    }
}