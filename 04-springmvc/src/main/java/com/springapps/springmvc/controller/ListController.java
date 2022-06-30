package com.springapps.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springapps.springmvc.dto.Employee;

@Controller
public class ListController {
	
	

	@RequestMapping("/readlist")
	public ModelAndView sendList() {
		List<Employee> emps=new ArrayList<Employee>();
		Employee emp=new Employee();
		emp.setId(161);
		emp.setName("John");
		emp.setSalary(150000);
		emps.add(emp);
		
		 emp=new Employee();
		emp.setId(162);
		emp.setName("Max");
		emp.setSalary(5000);
		emps.add(emp);
		
		 emp=new Employee();
		emp.setId(163);
		emp.setName("June");
		emp.setSalary(10000);
		emps.add(emp);
		ModelAndView mv=new ModelAndView();
		mv.addObject("employee",emps);
		mv.setViewName("displaylist");
		return mv;
		
	}
}
