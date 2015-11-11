class UrlMappings {

	static mappings = {
        '/userCon'{
            controller = 'User'
            action = 'create'
        }

        '/pet'{
            controller = 'Pet'
            action = 'create'
        }
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
        "/api/users"(resources: "UserRestful")
        "/"(view:"/index")
        "500"(view:'/error')
	}
}
