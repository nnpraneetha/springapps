package com.springapps.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springapps.ecommerce.entity.Products;
import com.springapps.ecommerce.service.ProductsService;



@Controller
public class CommonController {
	
	
	@Autowired
	ProductsService productsService;
	
	@RequestMapping("/menshoes")
	public String showmenshoes(ModelMap model) {
		List<Products> users= productsService.getProducts();
		model.addAttribute("users",users);
		return "menshoes";
	}
	
	@RequestMapping("/home")
	public ModelAndView hello() {
		ModelAndView modelandview=new ModelAndView();
		modelandview.setViewName("home");
		return modelandview;
	}
	
//	@RequestMapping(value = "/adminLoginAction", method = RequestMethod.POST)
//	public String adminLoginAction() {
//		return "adminLoginAction";
//	}
//	
//	@RequestMapping(value = "/adminHome", method = RequestMethod.GET)
//	public String adminHome() {
//		return "adminHome";
//	}
//	
//	
//	@RequestMapping(value = "/signin", method = RequestMethod.GET)
//	public String signinMethod() {
//		return "signinForm";
//	}
//	
//	@RequestMapping("/admin")
//	public ModelAndView admin() {
//		ModelAndView modelandview=new ModelAndView();
//		modelandview.setViewName("adminlogin");
//		return modelandview;
//	}
//	
	
	
	
	
}
