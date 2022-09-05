package com.example.Junit_practice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@DisplayName("Nested Test Example")
public class NestedTest {

	@Nested
	@DisplayName("Nested Class A")
	class A {
	
		@Test
		void test() {
			System.out.println("Nested class test method executed");
		}
		
	}
}