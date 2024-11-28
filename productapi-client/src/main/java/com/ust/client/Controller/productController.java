package com.ust.client.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ust.client.model.Product;

@RestController
@RequestMapping("/client/api1.0")
public class productController {
	@Autowired
	RestTemplate template;
	@GetMapping("/getallproducts")
	public List<Product> fetchproducts(){
		String url="http://localhost:8090/product/api1.0/productsinfo";
		List<Product>list=template.getForObject(url, List.class);
		return list;
	}
	@GetMapping(value="/products/{id}")
	public Product getprodbyid(@PathVariable Long productid) {
		String url="http://localhost:8090/product/api1.0/product/"+productid;
		Product selected=template.getForObject(url, Product.class);
		return selected;      
	}
	@GetMapping(value="/getProductByBrand/{brand}")
	public ResponseEntity<List<Product>> fethByBrand(@PathVariable String brand){
		String url = "http://localhost:8090/product/api1.0/prod/"+brand;
		List<Product> prod = template. getForObject(url, List.class);
		if(prod.size()>0)
			return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(prod);
		else
			return  new ResponseEntity("Not items found",HttpStatus.NOT_FOUND);
	}

}
