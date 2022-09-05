package com.example.Junit_practice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class RepeatedTest_example {

	Calculator c ;
	
	@BeforeEach
	void initEach() {
		c = new Calculator();
	}
	
	@Test
	@RepeatedTest(1000)
	void calculate() {
		int actual = c.calculate(1, 1);
		Assertions.assertEquals(2, actual);
	}
	
	
}
