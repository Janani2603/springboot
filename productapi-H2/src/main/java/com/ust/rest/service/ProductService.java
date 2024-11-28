package com.ust.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.rest.model.Product;
import com.ust.rest.repository.Productrepository;

@Service
public class ProductService {
	@Autowired
	private Productrepository repo;
	
	public Product addProduct(Product product) {
		return repo.save(product);
	}

}
