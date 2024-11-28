package com.ust.feignclient.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.feignclient.ifaces.Productfeigninterface;
import com.ust.feignclient.model.Product;

@RestController
@RequestMapping("/client")
public class FeignClient {

	@Autowired
	private Productfeigninterface feignclient;
	
	@GetMapping("/products")
	public List<Product> getAll(){
		return feignclient.getAllProducts();
	}
	@GetMapping("/product/{id}")
	public Optional<Product> getbyid(@PathVariable("id") long id) {
		return feignclient.getbyId(id);
	}
}
