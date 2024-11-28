package com.ust.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class SecurityController {//employeeresource
	@GetMapping("/")
	public String greet() {
		return "hello";
	}
	@GetMapping("/admin")
	public String greetAdmin() {
		return "Admin@work";
	}
	@GetMapping("/user")
	public String greetuser() {
		return "user@work";
	}

}
