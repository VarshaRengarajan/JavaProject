package com.feedback.UserFeedback.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController 
{
	@GetMapping(value="/feedback")
	public String feedback()
	{
		return "index";
	}

}
