package com.example.demo.controller;
import java.util.*;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import com.example.demo.model.Family;
import com.example.demo.service.FamilyService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/wallet")
public class Familycontroller {
	@Autowired
	private FamilyService service;
	 @PostMapping
	    public ResponseEntity<Family> createFamilyMember(@RequestBody Family familyMember) {
	        Family createdMember = service.createFamilyMember(familyMember);
	        return ResponseEntity.ok(createdMember);
	    }
	
	
//	
//	@GetMapping(value="/walletfind/{id}")
//	public ResponseEntity <Family>getById(@PathVariable long id)
//	{
//		
//		return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(service.getbyidd(id).get());
//		}
//	@GetMapping(value="/wallets/{name}")
//	public ResponseEntity <Wallet>getByname(@PathVariable String name)
//	{
//		Wallet wallet=service.getwalletbyname(name);
//		if(wallet!=null) {
//			return ResponseEntity.ok(wallet);
//		}
//		else {
//			return ResponseEntity.notFound().build();
//		}
//		
//	}
@GetMapping(value="/walletsinfo")
public ResponseEntity <List<Family>> displayWallets()
{
	return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(service.display());
}
//@PostMapping(value="/addData")
//public  ResponseEntity<Family> addProduct(@RequestBody Family prod)
//{
//	
//     Family savedproduct = service.addProduct(prod); 
// 
//	return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(savedproduct);
//	}
//@PutMapping(value="/modify")
//public  ResponseEntity<Wallet> updateProduct(@RequestBody Wallet prod)
//{
//
//	
//	         return null;
//}
@DeleteMapping(value="/delete/{id}")
public void  removeProduct(@PathVariable long id)
{
	service.removedel(id);
	
}
}


