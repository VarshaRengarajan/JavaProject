package com.user;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.user.entities.User;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class EntityTest {

	@Test
	public void getAndSetPassword() {
		User testUser = new User();
		
		testUser.setPassword("varsha@10");
		assertEquals(testUser.getPassword(),"varsha@10");
	}
	
	@Test
	public void getAndSetName() {
		User testUser = new User();
		
		testUser.setName("varsha");
		assertEquals(testUser.getName(),"varsha");
	}
	
	@Test
	public void getAndSetEmail() {
		User testUser = new User();
		
		testUser.setEmail("vars@gmail.com");
		assertEquals(testUser.getEmail(),"vars@gmail.com");
	}
	
	@Test
	public void checkToString() {
		User testUser = new User();
		
		assertNotNull(testUser.toString());
	}
	
	@Test
	public void checkConstructor() {
		User testUser = new User("varsha","vars@gmail.com","varsha@10");
		
		User checkUser = new User();
		checkUser.setName("varsha");
		checkUser.setEmail("vars@gmail.com");
		checkUser.setPassword("varsha@10");
		
		assertEquals(testUser.getName(), checkUser.getName());
		assertEquals(testUser.getEmail(), checkUser.getEmail());
		assertEquals(testUser.getPassword(), checkUser.getPassword());
	}
	
	@Test
	public void testDefaultConstructor() {
		User testUser = new User();
		
		assertNotNull(testUser);
	}
}




