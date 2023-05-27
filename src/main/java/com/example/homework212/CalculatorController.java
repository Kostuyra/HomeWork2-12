package com.example.homework212;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
class CalculateController {
	private final CalculateServiceInterface calculateService;

	public CalculateController(CalculateServiceInterface calculateService) {
		this.calculateService = calculateService;
	}

	@GetMapping()
	String homeCalculator() {
		return "Добро пожаловать в калькулятор";
	}

	@GetMapping(path = "/plus")
	String plusCalculator(@RequestParam() double num1, @RequestParam() double num2) {
		return num1 + " + " + num2 + " = " + calculateService.calculatePlus(num1, num2);
	}

	@GetMapping(path = "/minus")
	String minusCalculator(@RequestParam() double num1, @RequestParam() double num2) {
		return num1 + " - " + num2 + " = " + calculateService.calculateMinus(num1, num2);
	}

	@GetMapping(path = "/multiply")
	String multiplyCalculator(@RequestParam() double num1, @RequestParam double num2) {
		return num1 + " * " + num2 + " = " + calculateService.calculateMultiply(num1, num2);
	}

	@GetMapping(path = "/divide")
	String divisionCalculator(@RequestParam() double num1, @RequestParam double num2) {
		return num1 + " / " + num2 + " = " + calculateService.calculateDivision(num1, num2);
	}

}
