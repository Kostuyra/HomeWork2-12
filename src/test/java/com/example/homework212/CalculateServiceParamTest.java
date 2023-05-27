package com.example.homework212;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.example.homework212.CalculateServiceConstants.*;

public class CalculateServiceParamTest {
	private final CalculateService out = new CalculateService();

	@ParameterizedTest
	@MethodSource("provideParamsForSumTest")
	public void sumTest(double num1, double num2, double expect) {
		double result = out.calculatePlus(num1, num2);
		Assertions.assertEquals(expect, result);
	}

	@ParameterizedTest
	@MethodSource("provideParamsForSubstractTest")
	public void substractTest(double num1, double num2, double expect) {
		double result = out.calculateMinus(num1, num2);
		Assertions.assertEquals(expect, result);
	}

	@ParameterizedTest
	@MethodSource("provideParamsForMultiplyTest")
	public void multiplyTest(double num1, double num2, double expect) {
		double result = out.calculateMultiply(num1, num2);
		Assertions.assertEquals(expect, result);
	}

	@ParameterizedTest
	@MethodSource("provideParamsForDivideTest")
	public void divideTest(double num1, double num2, double expect) {
		double result = out.calculateDivision(num1, num2);
		Assertions.assertEquals(expect, result);
	}


	public static Stream<Arguments> provideParamsForSumTest() {
		return Stream.of(Arguments.of(NUM1, NUM2, SUM_RESULT1),
				Arguments.of(NUM3, NUM4, SUM_RESULT2));
	}

	public static Stream<Arguments> provideParamsForSubstractTest() {
		return Stream.of(Arguments.of(NUM1, NUM2, SUBSTRACT_RESULT1),
				Arguments.of(NUM3, NUM4, SUBSTRACT_RESULT2));
	}

	public static Stream<Arguments> provideParamsForMultiplyTest() {
		return Stream.of(Arguments.of(NUM1, NUM2, MULT_RESULT1),
				Arguments.of(NUM3, NUM4, MULT_RESULT2));
	}
	public static Stream<Arguments> provideParamsForDivideTest() {
		return Stream.of(Arguments.of(NUM1, NUM2, DIVIDE_RESULT1),
				Arguments.of(NUM3, NUM4, DIVIDE_RESULT2));
	}

}
