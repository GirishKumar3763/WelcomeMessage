package com.girish.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeMessageController {
	
	
	
	@RequestMapping("/getmessage")
	public String getMessage() {
		return "Welcome to  ECS";
	}
	
	

}
