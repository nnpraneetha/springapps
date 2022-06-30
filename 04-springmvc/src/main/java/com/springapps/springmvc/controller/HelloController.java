package com.springapps.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView modelandview=new ModelAndView();
		modelandview.addObject("id",123);
		modelandview.addObject("name","john");
		modelandview.addObject("salary",50000);
		modelandview.setViewName("hello");
		return modelandview;
	}
}
