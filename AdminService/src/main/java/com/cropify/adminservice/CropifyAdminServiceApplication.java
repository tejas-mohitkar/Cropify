package com.cropify.adminservice;

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
					title = "Admin Microservice REST API Documentation",
					description = "This Microservice is for Admin of organizations to know overall growth of application",
					version = "V1",
					
					contact = @Contact(
									name = "Tejas Mohitkar",
									email = "tejasmohitkar2@gmail.com",
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
public class CropifyAdminServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CropifyAdminServiceApplication.class, args);
	}

}
