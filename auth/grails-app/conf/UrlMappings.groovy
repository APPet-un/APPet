class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.${format})?" {
            constraints {
                // apply constraints here
            }
        }

        "/"(view: "/index")
        "500"(view: '/error')
        //
        // RESTService api
        "/api/client"(resources: "client")
        "/api/pet"(resources: "pet")
        "/api/pet/$email"(resources: "pet")
        "/api/post"(resources: "post")
        "/api/user"(resources: "user")
        "/api/user/$email"(resources: "user")
        //"/api/upload" (resources: "upload")
        "/api/veterinary"(resources: "veterinary")


    }
}
