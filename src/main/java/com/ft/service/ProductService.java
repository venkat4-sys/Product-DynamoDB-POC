package com.ft.service;

import java.util.List;

import com.ft.entity.Product;

public interface ProductService {
	
	public String saveProduct(Product product);
	
	public Product getProductById(Integer id);

	public List<Product> getAllProducts();
}
