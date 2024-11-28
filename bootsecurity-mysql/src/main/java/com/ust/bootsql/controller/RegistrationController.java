package com.ust.bootsql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.bootsql.Model.MyUser;
import com.ust.bootsql.repository.UserRepository;
@RestController
@RequestMapping("/register")
public class RegistrationController {
	@Autowired
	private UserRepository repository;
	@Autowired
	PasswordEncoder encoder;
	@PostMapping("/add")
	public MyUser newUser(@RequestBody MyUser user) {
		user.setPassword(encoder.encode(user.getPassword()));
		return repository.save(user);
	}

}
