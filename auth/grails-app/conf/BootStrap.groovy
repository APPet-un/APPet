import auth.Role
import auth.User
import auth.UserRole
import auth.Pet
import org.apache.commons.lang.RandomStringUtils

class BootStrap {

    def init = { servletContext ->

        char letter = 'F'

        User user = new User(firstName: "fabian", lastName: "monsalve", emailUser: "test@test.com", username: "test@test.com", password: "test123")
        user.save(failOnError: true)
        Pet pet1 = new Pet(name: 'Almendra',bornDate: new Date(),gender: (char)'F',species: 'Gato',breed: 'criollo',color: 'cafe',microchip: false,owner: user).save(failOnError: true)




        Role roleUser = new Role(authority: "ROLE_USER")
        roleUser.save()

        new UserRole(user: user, role: roleUser).save()


    }
    def destroy = {

    }
}