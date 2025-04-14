package com.cropify.vehiclerentalservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
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
