package com.springdemos.springcore.dependencycheck;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		// create spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/dependencycheck/config.xml");

		// get employee bean from container
		Prescription presc = (Prescription) context.getBean("presc");

		// print the bean
		System.out.println(presc);

	}
}
