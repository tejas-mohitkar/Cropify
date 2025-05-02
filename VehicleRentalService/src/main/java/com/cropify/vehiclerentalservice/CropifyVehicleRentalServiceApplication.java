package com.cropify.vehiclerentalservice;

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
					title = "Vehicle Rental Microservice REST API Documentation",
					description = "This Microservice is for Farmer to Rent Vehicle",
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
public class CropifyVehicleRentalServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CropifyVehicleRentalServiceApplication.class, args);
	}

}

//CREATE TABLE machine (
//	    machine_id BIGINT PRIMARY KEY AUTO_INCREMENT,
//	    name VARCHAR(100),
//	    type VARCHAR(100),
//	    rate_per_hour DECIMAL(10,2)
//	);
//
//	CREATE TABLE machine_booking (
//	    booking_id BIGINT PRIMARY KEY AUTO_INCREMENT,
//	    user_id BIGINT,
//	    machine_id BIGINT,
//	    date DATE,
//	    hours_used INT,
//	    FOREIGN KEY (user_id) REFERENCES users(user_id),
//	    FOREIGN KEY (machine_id) REFERENCES machine(machine_id)
//	);
//
//	CREATE TABLE machine_expense (
//	    expense_id BIGINT PRIMARY KEY AUTO_INCREMENT,
//	    machine_id BIGINT,
//	    description TEXT,
//	    amount DECIMAL(10,2),
//	    expense_date DATE,
//	    FOREIGN KEY (machine_id) REFERENCES machine(machine_id)
//	);
