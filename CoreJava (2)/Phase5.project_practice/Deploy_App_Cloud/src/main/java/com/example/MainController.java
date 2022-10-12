package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	
	@GetMapping("/home")
	public String home(){
		return "Hello spring boot app is deployed to AWS";
		
	}

}
