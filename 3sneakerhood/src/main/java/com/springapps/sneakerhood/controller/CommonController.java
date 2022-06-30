package com.springapps.sneakerhood.controller;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springapps.sneakerhood.dao.ProductDao;
import com.springapps.sneakerhood.entity.Product;
import com.springapps.sneakerhood.service.ProductService;




@Controller
public class CommonController {
	
	@Autowired
	ProductService productService;
	
	
	@RequestMapping("/menshoes")
	public String showRegistrationPage(ModelMap model) {
		List<Product> products= productService.getProducts();
		model.addAttribute("products",products);
		return "menshoes";
	}
	
	
	
	@RequestMapping("/home")
	public ModelAndView hello() {
		ModelAndView modelandview=new ModelAndView();
		modelandview.setViewName("home");
		return modelandview;
	}
	
	@RequestMapping(value = "/adminLoginAction", method = RequestMethod.POST)
	public String adminLoginAction() {
		return "adminLoginAction";
	}
	
	@RequestMapping(value = "/adminHome", method = RequestMethod.GET)
	public String adminHome() {
		return "adminHome";
	}
	
	
	@RequestMapping(value = "/signin", method = RequestMethod.GET)
	public String signinMethod() {
		return "signinForm";
	}
	
	@RequestMapping("/admin")
	public ModelAndView admin() {
		ModelAndView modelandview=new ModelAndView();
		modelandview.setViewName("adminlogin");
		return modelandview;
	}
	
	
	
	
	
}
