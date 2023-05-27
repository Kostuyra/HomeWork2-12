package com.example.homework212;

import org.springframework.stereotype.Service;


@Service
public class CalculateService implements CalculateServiceInterface {

	public double calculatePlus(double num1, double num2) {
		return num1 + num2;
	}

	public double calculateMinus(double num1, double num2) {
		return num1 - num2;
	}

	public double calculateMultiply(double num1, double num2) {
		return num1 * num2;
	}

	public double calculateDivision(double num1, double num2) {
		if (num2 == 0){
			throw new CalculatorArgumentException();
		}
		return num1 / num2;
	}

}
