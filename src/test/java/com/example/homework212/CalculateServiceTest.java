package com.example.homework212;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.example.homework212.CalculateServiceConstants.*;

public class CalculateServiceTest {
	private final CalculateService out = new CalculateService();
	@Test
	public void sumTest() {
		double result = out.calculatePlus(NUM1, NUM2);
		Assertions.assertEquals(SUM_RESULT1, result);
		result = out.calculatePlus(NUM3, NUM4);
		Assertions.assertEquals(SUM_RESULT2, result);
	}

	@Test
	public void substractTest() {
		double result = out.calculateMinus(NUM1, NUM2);
		Assertions.assertEquals(SUBSTRACT_RESULT1, result);
		result = out.calculateMinus(NUM3, NUM4);
		Assertions.assertEquals(SUBSTRACT_RESULT2, result);
	}

	@Test
	public void multiplyTest() {
		double result = out.calculateMultiply(NUM1, NUM2);
		Assertions.assertEquals(MULT_RESULT1, result);
		result = out.calculateMultiply(NUM3, NUM4);
		Assertions.assertEquals(MULT_RESULT2, result);
	}

	@Test
	public void divideTest() {
		double result = out.calculateDivision(NUM1, NUM2);
		Assertions.assertEquals(DIVIDE_RESULT1, result);
		result = out.calculateDivision(NUM3, NUM4);
		Assertions.assertEquals(DIVIDE_RESULT2, result);
	}

	@Test
	public void shouldThrowCalculateArgumentException() {
		Assertions.assertThrows(CalculatorArgumentException.class, () -> out.calculateDivision(NUM1, NUM_NULL));
	}

}
