package com.springop.controller;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springop.bean.User;
import com.springop.dao.UserDAO;



@Controller
public class UserController {
	@Autowired
	UserDAO dao;
	@RequestMapping("/viewuser")
	public String viewuser(Model m,@RequestParam(value="id" ,required=true)Integer id){
		System.out.println(id);
		List<User> userList= dao.getUserDetails(id);
		m.addAttribute("userList",userList);
		System.out.println(Arrays.toString(userList.toArray()));
		System.out.println(userList);
		if(userList.isEmpty())
			return "redirect:/invalid";
		else
			return "viewuser";
	}
	
	@RequestMapping(value="/edituser/{id}")
	public String edit(@PathVariable int id, Model m){

		User user=dao.getId(id);
		m.addAttribute("users",user);
		return "updateuser";
	}
	@RequestMapping(value="/editsave",method=RequestMethod.POST)
	public String editSave(@ModelAttribute("users") User user,Model m,@RequestParam(value="id" ,required=false)Integer id){
		System.out.println(user.getId());
		dao.update(user);
		List<User> userList= dao.getUserDetails(id);
		m.addAttribute("userList",userList);
		return "viewuser";
	}
	
	@RequestMapping("/viewalluser")
	public String viewalluser(Model m){
		List<User> userList= dao.getUserAllDetails();
		m.addAttribute("userList",userList);
		return "viewuser";
}
	@RequestMapping("/invalid")
	public void invalid(HttpServletRequest request,ModelMap map, HttpServletResponse response) {
		try {
			request.getRequestDispatcher("/index.jsp").include(request, response);
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<p style=font-size:18px;color:red;>Sorry No records are found</p>");				
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
