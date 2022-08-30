package com.feedback.UserFeedback.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RestController;

import com.feedback.UserFeedback.entities.Feedback;
import com.feedback.UserFeedback.repositories.FeedbackRepository;

@RestController
public class FeedbackController 
{
	@Autowired
	FeedbackRepository repository;
	@PostMapping(value="/submitFeedback")
	public String submit(Feedback f)
	{
		System.out.println(f);
		repository.save(f);
		return "Feedback is submitted successfully";
	}

}
