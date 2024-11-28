package com.ust.msB.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.msB.model.familt;
import com.ust.msB.repository.repo;

@RestController
@RequestMapping("/msB")
public class controllerfam {
	@Autowired
	repo repo1;
	
	@PostMapping
public ResponseEntity<familt> addprod(@RequestBody familt pro){
		
		if(pro!=null)
		    repo1.save(pro);
		return ResponseEntity.status(HttpStatus.OK).body(pro);
	}

}
