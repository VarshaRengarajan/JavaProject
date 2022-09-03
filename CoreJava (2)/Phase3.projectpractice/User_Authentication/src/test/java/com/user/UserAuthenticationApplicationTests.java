package com.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


import com.user.entities.User;
import com.user.service.UserService;

@SpringBootTest
class UserAuthenticationApplicationTests {
	
	
	@Autowired
	private UserService userService;
	

	@Test
	void contextLoads() {
	}
	
	@Test
	void testServiceCall() {
		Iterable<User> users = userService.GetAllUsers();
		Integer count = 0;
		
		for(User u: users)
			count++;
		
		assertNotEquals(count, 0);
	}
	
	@Test
	void countUsers() {
		Iterable<User> users = userService.GetAllUsers();
		Integer count = 0;
		
		for(User u: users)
			count++;
		
		assertEquals(count, 1);
	}
	
	@Test
	void checkAllUsers() {
		Iterable<User> users = userService.GetAllUsers();
		
		for(User u: users)
			assertNotNull(u);
	}
}


