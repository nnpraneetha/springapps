package com.springapps.sneakerhood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springapps.sneakerhood.service.UserService;


public class CommomController {

	
	@Autowired
	UserService userService;
	
	@RequestMapping("/home")
	public String showRegistrationPage() {
		return "home";
	}
}
