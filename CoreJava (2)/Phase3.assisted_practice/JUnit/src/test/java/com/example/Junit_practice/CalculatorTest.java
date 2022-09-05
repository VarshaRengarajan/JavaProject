package com.example.Junit_practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class CalculatorTest {
	
	Calculator calc ;
	
	@BeforeEach
	void intEach() {
		calc = new Calculator();
	}
	
	
	@Test
	void test_calculate() {
		
		// Step 1: Prepare input
		int a = 1;
		int b = 1;
		
		// Step 2: Find actual Value
		int actual = calc.calculate(a, b);
		
		// Step 3: Set exected value
		int expected = 2;
		
		// Step 4: Match expectations using Assertions API
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	void test_calculate1() {
		
		// Step 1: Prepare input
		int a = -1;
		int b = 1;
		
		// Step 2: Find actual Value
		int actual = calc.calculate(a, b);
		
		// Step 3: Set exected value
		int expected = 0;
		
		// Step 4: Match expectations using Assertions API
		Assertions.assertEquals(expected, actual);
	}
}