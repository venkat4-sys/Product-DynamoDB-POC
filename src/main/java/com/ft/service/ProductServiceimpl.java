package com.ft.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ft.entity.Product;
import com.ft.repo.ProductRepo;

@Service
public class ProductServiceimpl implements ProductService {
	
	@Autowired
	private ProductRepo productRepo;
	
	@Override
	public String saveProduct(Product product) {
		Product save = productRepo.save(product);
		
		if(save!=null) {
			return "product saved successfully";
		}
		
		return "product not saved";
		
	}
	
	@Override
	public Product getProductById(Integer id) {
		Optional<Product> productId = productRepo.findById(id);
		if(productId.isPresent()) {
			return productId.get();
		}
		return null;
	}
	
	@Override
	public List<Product> getAllProducts() {
		Iterable<Product> all = productRepo.findAll();
		return null;
	}

}
