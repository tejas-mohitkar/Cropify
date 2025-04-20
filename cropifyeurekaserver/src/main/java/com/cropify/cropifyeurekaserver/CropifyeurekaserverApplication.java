package com.cropify.cropifyeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CropifyeurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(CropifyeurekaserverApplication.class, args);
	}

}
