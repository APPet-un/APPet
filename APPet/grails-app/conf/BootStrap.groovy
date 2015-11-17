import appet.Pet
import appet.Role
import appet.User
import appet.Client
import appet.UserRole
import appet.Veterinary

class BootStrap {

    def init = { servletContext ->
        def roleAdmin = new Role(authority: "ROLE_ADMIN").save(failOnError: true)
        def roleClient = new Role(authority: "ROLE_USER").save(failOnError: true)


        def admin = new User(address: "casa 1",firstName: "Usuario1", lastName: "Apellido1", mobilPhone: 1234,emailUser: "admin@unal.com",password: "admin")
        admin.save()

        

        def client = new Client(address: "casa 2",firstName: "Usuario2", lastName: "Apellido2", mobilPhone: 5678,emailUser: "client@unal.com",password: "client1")
        client.save()

        def veterinary = new Veterinary(mobilPhone: 1234567890,name: "canitos", telephone: 12345678, address: "calledosfalsa",webPage: "www.lola.com")
        veterinary.save()

		def pet1 = new Pet(name: "milu",bornDate: new Date(),breed: "criollo", color: "Negro",gender: (char)'F',microchip: false)
        pet1.save()
		
        UserRole.create(admin, roleAdmin)
        UserRole.create(client, roleClient)
        //CreatePet

        new User(address: "casa 1", emailUser: "user1@gmail.com", firstName: "Usuario1", lastName: "Apellido1", mobilPhone: 1234).save()
        new User(address: "casa 2", emailUser: "user2@gmail.com", firstName: "Usuario2", lastName: "Apellido2", mobilPhone: 5678).save()
    }
    def destroy = {
    }
}
