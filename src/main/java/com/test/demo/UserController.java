package com.test.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@GetMapping( value = "/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}