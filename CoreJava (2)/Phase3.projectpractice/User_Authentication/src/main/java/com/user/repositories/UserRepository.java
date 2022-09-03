package com.user.repositories;
import org.springframework.data.repository.CrudRepository;

import com.user.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	User findByName(String name);

  

}
