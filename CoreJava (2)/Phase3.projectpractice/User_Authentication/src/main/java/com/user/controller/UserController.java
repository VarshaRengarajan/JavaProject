package com.user.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.entities.User;
import com.user.repositories.UserRepository;


@RestController
public class UserController {

	@Autowired
	UserRepository userRepository;
	

	@GetMapping(value="/")
    public String showIndexPage(ModelMap model){  
		
		 return "<html>\n"
			 		+ "<head>\n"
			 		+ "</head>\n"
			 		+ "<body>\n"
			 		+ "	<div>\n"
			 		+ "		<h1>User Login Page</h1>\n"
			 		+ "		\n"
			 		+ "		<h2 class=\"hello-title\">Welcome</h2>\n"
			 		+ "		\n"
			 		+ "		<a href=\"/allusers\">View all users</a>\n"
			 		+ "		<br><br>\n"
					+ "     <form method=\"get\" action=\"login\">\n"
					+ "			<br><h3>Login below:</h3>\n"
					+ "			<input type=\"text\" id=\"name\" name=\"name\" placeholder=\"Name\" required>\n"
					+ "			<input type=\"text\" id=\"email\" name=\"email\" placeholder=\"Email\" required>\n"
					+ "			<input type=\"text\" id=\"password\" name=\"password\" placeholder=\"Password\" required>	\n"
					+ "			<input type=\"submit\" value=\"Enter\" />\n"
					+ "		</form>"
			 		+ "	</div>\n"
			 		+ "</body>\n"
			 		+ "</html>";
    }


    @GetMapping("/login")
    public String showLogin(@RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("password") String password, ModelMap map) {
        User u = new User(name,email,password);
        userRepository.save(u); 
        
        return "<html>\n"
 		+ "<head>\n"
 		+ "</head>\n"
 		+ "<body>\n"
 		+ "	<div>\n"
 		+ "		<h1>Logged In</h1>\n"
 		+ "		\n"
 		+ "		<h2 class=\"hello-title\">Successfully Added Your Information</h2>\n"
 		+ "	</div>\n"
 		+ "</body>\n"
 		+ "</html>";
    }
    

    @GetMapping("/allusers")
	public @ResponseBody String getAllUsers() {
        // This returns a JSON or XML with the User
        Iterable<User> allUser = userRepository.findAll();
		return "<html>\n"
		 		+ "<head>\n"
		 		+ "</head>\n"
		 		+ "<body>\n"
		 		+ "	<div class=\"center\">\n"
		 		+ "<h1>User Table</h1>\n"
        		+ allUser.toString()
		        + "	</div>\n"
		 		+ "</body>\n"
		 		+ "</html>";
    }
    
    @PostMapping("/login")
    public String submitLogin(@RequestParam String name, @RequestParam String password){

        //TODO:

        return "Success";



    }
}