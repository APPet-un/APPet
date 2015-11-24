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
        "/api/user"(resources: "user")
        "/api/user/$email"(resources: "user")
        "/api/pet/$email"(resources: "pet")
        "/api/veterinary"(resources: "veterinary")


    }
}
