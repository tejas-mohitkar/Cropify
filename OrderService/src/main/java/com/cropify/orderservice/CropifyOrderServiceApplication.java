package com.cropify.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CropifyOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CropifyOrderServiceApplication.class, args);
	}

}

//CREATE TABLE orders (
//	    order_id BIGINT PRIMARY KEY AUTO_INCREMENT,
//	    user_id BIGINT,
//	    order_date DATE,
//	    total_amount DECIMAL(10,2),
//	    status VARCHAR(50),
//	    FOREIGN KEY (user_id) REFERENCES users(user_id)
//	);
//
//	CREATE TABLE order_item (
//	    item_id BIGINT PRIMARY KEY AUTO_INCREMENT,
//	    order_id BIGINT,
//	    product_id BIGINT,
//	    quantity INT,
//	    price DECIMAL(10,2),
//	    FOREIGN KEY (order_id) REFERENCES orders(order_id),
//	    FOREIGN KEY (product_id) REFERENCES product(product_id)
//	);

