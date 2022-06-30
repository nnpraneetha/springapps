package com.springapps.springmvcorm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springapps.springmvcorm.entity.User;
import com.springapps.springmvcorm.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping("/register")
	public String showRegistrationPage() {
		return "userreg";
	}
	
	@RequestMapping(value="/registeruser",method=RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user,ModelMap model) {
		
		int result = userService.save(user);
		String msg="User created with id: "+result;
		model.addAttribute("result",msg);
		
		List<User> users= userService.getUsers();
		model.addAttribute("users",users);
		
		return "userreg";
	}
}
