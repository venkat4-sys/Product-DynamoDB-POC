package com.ft;

import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDynamoDBRepositories(basePackages = "com.ft.repo")
public class ProductSaleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductSaleApplication.class, args);
	}

}
