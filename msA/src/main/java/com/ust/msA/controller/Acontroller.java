package com.ust.msA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.msA.model.product;
import com.ust.msA.repository.repo;


@RestController
@RequestMapping("/msA")
public class Acontroller {
	@Autowired
	repo repo1;
	
	@PostMapping
public ResponseEntity<product> addprod(@RequestBody product pro){
		
	
		return ResponseEntity.status(HttpStatus.OK).body(repo1.save(pro));
	}
@GetMapping("/get")
public ResponseEntity<List<product>> disp(){
		
	
		return ResponseEntity.status(HttpStatus.OK).body(repo1.findAll());
	}

}
