package com.springop.dao;


import java.util.List;



import org.springframework.jdbc.core.JdbcTemplate;

import com.springop.bean.User;

public class UserDAO {
	JdbcTemplate template;
	public void setTemplate(JdbcTemplate template){
		this.template=template;
	}
	public int update(User user){
		String sql="update users set name=?,email=?,mobile=?where id=?";
		int ans=template.update(sql,user.getName(),user.getEmail(),user.getMobile(),user.getId());
		return ans;
	}
		public User getId(int id){
			String sql="select * from users where id=?";
			@SuppressWarnings("deprecation")
			User emp=template.queryForObject(sql,new Object[]{id},new UserMapper());
			
			return emp;
		}
		
		public List<User> getUserDetails(int id){
		
			String sql="select * from users where id="+id+"";
			
			List<User>userList=template.query(sql,new UserMapper());
			System.out.println(userList);
				return userList;
		
		}
		
		public List<User> getUserAllDetails() {
			String sql="select * from users";
			List<User>userList=template.query(sql,new UserMapper());
			return userList;
		}

}

