package com.springop.dao;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springop.bean.User;
//RowMapper converts Records from ResultSet to Objects
public class UserMapper implements RowMapper<User>{
	
	public User mapRow(ResultSet rs, int rowNum)  throws SQLException{
		
		User user =new User();
		user.setId(rs.getInt("id"));
		
		user.setEmail(rs.getString("email"));
		user.setMobile(rs.getString("mobile"));
		user.setName(rs.getString("name"));
		
		
		return user;
	}
	

}	
