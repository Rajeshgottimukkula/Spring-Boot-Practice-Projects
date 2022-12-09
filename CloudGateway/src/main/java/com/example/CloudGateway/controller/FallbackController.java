package com.example.CloudGateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

	
	@GetMapping("/employeeServiceFallback")
	public String employeeServiceFallback() {
		return "Employee Service is down!";
	}
}
