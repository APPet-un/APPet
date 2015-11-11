package appet

import org.apache.commons.lang.builder.HashCodeBuilder

class UserRole implements Serializable {

    private static final long serialVersionUID = 1

    User user
    Role role

    boolean equals(other){
        if(!(other instanceof UserRole))
            return false
        other.user?.id == user?.idd && other.role?.id == role?.id
    }

    int hashCode(){
        def builder = new HashCodeBuilder()
        if(user)builder.append(user.id)
        if(role)builder.append(role.id)
        builder.toHashCode()
    }

    static UserRole create(User user,Role role, boolean flush = false){
        new UserRole(user:user,role:Role).save(flush: flush,insert: true)
    }

    static boolean remove(User u, Role r, boolean flush = false){
        int rowCount = UserRole.where{
            user == User.load(u.id) && role == Role.load(r.id)
        }.deleteAll()
        rowCount > 0
    }

    static void removeAll(User u){
        UserRole.where{
            role == Role.load(r.id)
        }.deleteAll()
    }

    static constraints = {
        id composite: ['role','userCon']
        //version false

    }
}
