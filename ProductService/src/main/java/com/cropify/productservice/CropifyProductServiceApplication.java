package com.cropify.productservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CropifyProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CropifyProductServiceApplication.class, args);
	}

}

//CREATE TABLE category (
//	    category_id BIGINT PRIMARY KEY AUTO_INCREMENT,
//	    name VARCHAR(100) UNIQUE
//	);
//
//	CREATE TABLE product (
//	    product_id BIGINT PRIMARY KEY AUTO_INCREMENT,
//	    name VARCHAR(255),
//	    price DECIMAL(10,2),
//	    stock INT,
//	    category_id BIGINT,
//	    description TEXT,
//	    FOREIGN KEY (category_id) REFERENCES category(category_id)
//	);

