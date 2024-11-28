package com.ust.factservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/factorial")
public class factcontroller {
	@GetMapping("/find/{id}")
	public int getfact(@PathVariable int id) {
		int factorial=1;
		for(int i=1;i<=id;i++) {
			factorial*=i;
		}
		return factorial;
	}

}
