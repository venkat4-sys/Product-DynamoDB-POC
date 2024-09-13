package com.ft.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ft.entity.Product;
import com.ft.service.ProductService;

@RestController
public class ProductRest {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("/saveProduct")
	public ResponseEntity<String> saveProduct(@RequestBody Product product) {
		String saveProduct = productService.saveProduct(product);
		return new ResponseEntity<String>(saveProduct,org.springframework.http.HttpStatus.CREATED);
		
	}
	
	@GetMapping("/getProduct/{id}")
	public ResponseEntity<?> getProduct(@PathVariable Integer id) {
		Product product = productService.getProductById(id);
		return new ResponseEntity<>(product,org.springframework.http.HttpStatus.OK);
		
	}

}
