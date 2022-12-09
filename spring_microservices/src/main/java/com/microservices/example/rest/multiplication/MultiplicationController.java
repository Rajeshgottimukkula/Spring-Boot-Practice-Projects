package com.microservices.example.rest.multiplication;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultiplicationController {
	
	protected Logger logger = Logger.getLogger(MultiplicationController.class
			.getName());

	@RequestMapping("/multiply")
	public String doMultiply(@RequestParam(defaultValue="0") String multiplicand,
			@RequestParam(defaultValue="0") String multiplier) {

		int augend1 = Integer.valueOf(multiplicand);
		int augend2 = Integer.valueOf(multiplier);
		int product = augend1 * augend2;

		return "{\"multiplicand\":\"" + multiplicand + "\", \"multiplier\":\"" + multiplier + "\", \"product\": \"" + product + "\"}";
	}
}
