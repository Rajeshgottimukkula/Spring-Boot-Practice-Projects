package com.rajeshh.ServiceA.Controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;

@RestController
@RequestMapping("/a")
public class ServiceA_Controller {

	
	@Autowired
	RestTemplate restTemplate;
	
	int count=1;
	private static final String SERVICE_A="serviceA";
	@GetMapping("/")
	//@CircuitBreaker(name=SERVICE_A,fallbackMethod="serviceAfallBack")
	@Retry(name=SERVICE_A)
	public String serviceA() {
		System.out.println("Retry called "+count++ +"time at"+ new java.util.Date());
		return restTemplate.getForObject("http://localhost:8040/b/", String.class);
	}
	public String serviceAfallBack(Exception e) {
		return "This is a fallback method for service A";
	}
}
