package com.cropify.UserService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CropifyUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CropifyUserServiceApplication.class, args);
	}

}

//CREATE TABLE users (
//	    user_id BIGINT PRIMARY KEY AUTO_INCREMENT,
//	    name VARCHAR(100),
//	    email VARCHAR(255) UNIQUE,
//	    mobile VARCHAR(15),
//	    password VARCHAR(255),
//	    join_date DATE
//	);
//
//	CREATE TABLE address (
//	    address_id BIGINT PRIMARY KEY AUTO_INCREMENT,
//	    user_id BIGINT,
//	    village VARCHAR(100),
//	    city VARCHAR(100),
//	    district VARCHAR(100),
//	    state VARCHAR(100),
//	    pincode VARCHAR(10),
//	    FOREIGN KEY (user_id) REFERENCES users(user_id)
//	);
//
