package com.cropify.UserService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
					title = "User Microservice REST API Documentation",
					description = "This Microservice is for User of Application",
					version = "V1",
					
					contact = @Contact(
									name = "Tejas Mohitkar",
									email = "tejasmohitkar3@gmail.com",
									url = "https://localhost:8080/"
								),
					license = @License(
									name = "Apache 2.0",
									url= "https://localhost:8080/"
								)
				),
		externalDocs = @ExternalDocumentation(
					description = "This Microservice is for Admin of organizations to know overall growth of application",
					url= "https://localhost:8080/"
				)
		
		)
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
