class UrlMappings {

	static mappings = {
		"/profile/phone=${phone}"(controller: "profile", action: "getProfileByPhone")
	}
}
