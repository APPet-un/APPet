package auth

class Post {
    String title
    String description
    int type

    static constraints = {
        title (blank: false, nullable: false)
        description (blank: false, nullable: false)
        type (blank: false, nullable: false)
    }

    static mapping = {
        id generator: 'increment'//, name: 'post_id'
    }
}
