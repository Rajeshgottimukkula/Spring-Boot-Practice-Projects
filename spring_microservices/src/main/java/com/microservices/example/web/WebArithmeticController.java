package com.microservices.example.web;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebArithmeticController {
	@Autowired
	protected WebAdditionService additionService;

	@Autowired
	protected WebDivisionService divisionService;
	
	@Autowired
	protected WebMultiplicationService multiplicationService;

	@Autowired
	protected WebSubtractionService subtractionService;

	protected Logger logger = Logger.getLogger(WebArithmeticController.class
			.getName());

	public WebArithmeticController(WebAdditionService additionService, WebSubtractionService subtractionService,WebMultiplicationService multiplicationService,WebDivisionService divisionService) {
		this.additionService = additionService;
		this.subtractionService = subtractionService;
		this.divisionService = divisionService;
		this.multiplicationService = multiplicationService;		
	}

	@RequestMapping("/add")
	public String doAdd(@RequestParam(defaultValue="0") String addend1,
			@RequestParam(defaultValue="0") String addend2,
			Model model) {

		String sum = additionService.add(addend1, addend2);

		logger.info("Sum: " + sum);
		model.addAttribute("json", sum);

		return "sum";
	}

	@RequestMapping("/subtract")
	public String doSubtract(@RequestParam(defaultValue="0") String minuend,
			@RequestParam(defaultValue="0") String subtrahend,
			Model model) {

		String difference = subtractionService.subtract(minuend, subtrahend);

		logger.info("Difference: " + difference);
		model.addAttribute("json", difference);

		return "difference";
	}
	
	@RequestMapping("/multiply")
	public String doMultiply(@RequestParam(defaultValue="0") String multiplicand,
			@RequestParam(defaultValue="0") String multiplier,
			Model model) {

		String product = multiplicationService.multiply(multiplicand, multiplier);

		logger.info("Product: " + product);
		model.addAttribute("json", product);

		return "product";
	}

	@RequestMapping("/divide")
	public String doDivide(@RequestParam(defaultValue="0") String dividend,
			@RequestParam(defaultValue="1") String divisor,
			Model model) {

		String result = divisionService.divide(dividend, divisor);

		logger.info("Result: " + result);
		model.addAttribute("json", result);

		return "result";
	}
}
