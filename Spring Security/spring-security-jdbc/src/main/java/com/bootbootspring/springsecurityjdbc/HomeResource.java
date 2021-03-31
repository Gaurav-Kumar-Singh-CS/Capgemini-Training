package com.bootbootspring.springsecurityjdbc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
	@GetMapping("/")
	public String home() {
		return ("<h1>Olaaaa!</h1>");
	}
	
	@GetMapping("/user")
	public String user() {
		return ("<h1>Olaaaa! Userrrrr</h1>");
	}
	
	@GetMapping("/admin")
	public String admin() {
		return ("<h1>Olaaaa! Adminnnn</h1>");
	}

}

