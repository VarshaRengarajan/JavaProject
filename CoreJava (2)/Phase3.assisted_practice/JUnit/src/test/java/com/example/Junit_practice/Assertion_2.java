package com.example.Junit_practice;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class Assertion_2 {

	@Test
	void test() {

		Assertions.assertTrue(true);
		Assertions.assertFalse(false);
		
		String str = null;
		String str1 = "varsha";
		
		Assertions.assertNotSame(str, str1);
		Assertions.assertNull(str);
		
		String[] a1  = {"A", "B"};
		String[] a2 = {"A","B"};
		
		Assertions.assertArrayEquals(a1, a2);
	}

}