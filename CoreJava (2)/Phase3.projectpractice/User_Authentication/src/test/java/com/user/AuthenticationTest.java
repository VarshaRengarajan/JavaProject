package com.user;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;

import com.user.entities.User;
import com.user.repositories.UserRepository;

import org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;



@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class AuthenticationTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UserRepository userRepository;

    
    

    @Test
    public void passwordNotNull() {
    	
		Iterable<User> users = userRepository.findAll();
		for(User u: users)
			assertNotNull(u.getPassword());
    }

    @Test
    public void nameNotNull() {
    	
		Iterable<User> users = userRepository.findAll();
		for(User u: users)
			assertNotNull(u.getName());
    }

    @Test
    public void emailNotNull() {
    	
		Iterable<User> users = userRepository.findAll();
		for(User u: users)
			assertNotNull(u.getEmail());
    }


}

