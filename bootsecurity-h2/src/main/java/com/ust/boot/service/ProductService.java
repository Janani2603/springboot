package com.ust.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.boot.model.Product;
import com.ust.boot.repository.Productrepository;

@Service
public class ProductService {
	@Autowired
	private Productrepository repo;
	
	public Product addProduct(Product product) {
		return repo.save(product);
	}

}
