package appet

class UserController {
    static scaffold = User
    //def index() {}
    def createUser() {
        def b = new User(params)
        b.save()
        // redirect to a scaffolded action
        redirect(action:create)
    }
    def modifyUser() {
        def b = new User(params)
        b.refresh()
        // redirect to a scaffolded action
        redirect(action:show)
    }
}
