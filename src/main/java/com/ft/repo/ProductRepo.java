package com.ft.repo;

import org.springframework.data.repository.CrudRepository;

import com.ft.entity.Product;

public interface ProductRepo extends CrudRepository<Product, Integer>  {

}
