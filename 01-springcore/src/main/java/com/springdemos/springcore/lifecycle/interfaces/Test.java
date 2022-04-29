package com.springdemos.springcore.lifecycle.interfaces;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		// create spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/lifecycle/interfaces/config.xml");

		context.registerShutdownHook();
		// get employee bean from container
		Patient patient = (Patient) context.getBean("patient");

		// print the bean
		System.out.println(patient);

	}
}
