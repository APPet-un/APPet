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
        "/api/client"(resource: "client")
        "/api/pet"(resource: "pet")
        "/api/pet/$email"(resource: "pet")
        "/api/post" (resource: "post")
        "/api/user"(resource: "user")
        "/api/user/$email"(resource: "user")

        //"/api/upload" (resources: "upload")
        "/api/veterinary"(resource: "veterinary")

    }
}
