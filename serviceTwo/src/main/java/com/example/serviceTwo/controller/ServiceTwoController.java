package com.example.serviceTwo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceTwoController {

	
	@GetMapping("/")
	public String serviceTwoMethod() {
		return "Service two's method is called from service one";
	}
	
}
