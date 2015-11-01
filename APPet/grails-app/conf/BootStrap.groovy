import appet.User

class BootStrap {

    def init = { servletContext ->
        new User(address: "casa 1", emailUser: "user1@gmail.com", firstName: "Usuario1", lastName: "Apellido1", mobilPhone: 1234).save()
        new User(address: "casa 2", emailUser: "user2@gmail.com", firstName: "Usuario2", lastName: "Apellido2", mobilPhone: 5678).save()
    }
    def destroy = {
    }
}
