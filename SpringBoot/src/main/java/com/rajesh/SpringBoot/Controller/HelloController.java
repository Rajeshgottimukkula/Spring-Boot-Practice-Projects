package com.rajesh.SpringBoot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	
	@GetMapping("/")
	public String helloWorld() {
		return "Yaaayyyyy.....your page got a reqegdgsdhdwhwdhvedvh";
	}
}
