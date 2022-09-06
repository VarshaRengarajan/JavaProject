package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping("/")
	public String getMessage() {
		return  "<center><h1>Hello User! You are now protected</h1><br><a href=\"/user\">Log out</a></center>";
		
}
	@GetMapping("/user")
	public String getMessage1() {
		return "Thank you for using Spring security";
		
	}
}
