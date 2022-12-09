package com.example.serviceOne.controller;



import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;

@RestController
public class ServiceOneController {

	
	
	final String SERVICEONE="serviceOne";
	
	@Autowired
	RestTemplate restTemplate;
	
	int count=1;
	
	@CircuitBreaker(name=SERVICEONE,fallbackMethod="serviceOneFallBackMethod")
	@Retry(name=SERVICEONE)
	@GetMapping("/")
	public String serviceOneMethod() {
		System.out.println("Tried to connect with ServiceTwo for "+count++ +"time at"+new Date());
		return restTemplate.getForObject("http://localhost:8031/", String.class);
	}
	
	
	
	
	public String serviceOneFallBackMethod(Exception e) {
		return "Oh no, something is wrong! please try again";
	}
	
	
}
