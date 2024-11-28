package com.ust.feignclient.ifaces;

import java.util.List;
import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.ust.feignclient.model.Product;

@FeignClient(value="feignclient",url="http://localhost:8090/product/api1.0")
public interface Productfeigninterface {
	@GetMapping("/productsinfo")
	public List<Product> getAllProducts();
	@GetMapping("/product/{id}")
	public Optional<Product> getbyId(@PathVariable("id") long id);
    
}
