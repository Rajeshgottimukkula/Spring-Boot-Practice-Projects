package com.microservices.example.rest.division;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DivisionController {
	
	protected Logger logger = Logger.getLogger(DivisionController.class
			.getName());

	@RequestMapping("/divide")
	public String doDivide(@RequestParam(defaultValue = "0") String dividend,
			@RequestParam(defaultValue = "1") String divisor) {

		int augend1 = Integer.valueOf(dividend);
		int augend2 = Integer.valueOf(divisor);
		if (augend2 == 0)
			throw new ArithmeticException("Divisor cannot be 0");
		double result = augend1 / augend2;
		int quotient = augend1 / augend2;
		int remainder = augend1 % augend2;
		return "{\"dividend\":\"" + dividend + "\", \"divisor\":\"" + divisor + "\", \"quotient\": \"" + quotient
				+ "\", \"remainder\": \"" + remainder + "\", \"result\": \"" + result + "\"}";
	}
}
