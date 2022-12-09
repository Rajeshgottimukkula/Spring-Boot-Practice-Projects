package com.example.GatewayEducation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GatewayEducationApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayEducationApplication.class, args);
	}

}
