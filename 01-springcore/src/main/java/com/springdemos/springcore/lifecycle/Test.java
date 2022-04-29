package com.springdemos.springcore.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		// create spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/lifecycle/config.xml");

		context.registerShutdownHook();
		// get employee bean from container
		Patient patient = (Patient) context.getBean("patient");

		// print the bean
		System.out.println(patient);

	}
}
