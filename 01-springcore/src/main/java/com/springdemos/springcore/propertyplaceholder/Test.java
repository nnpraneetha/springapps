package com.springdemos.springcore.propertyplaceholder;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		// create spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/propertyplaceholder/config.xml");

		context.registerShutdownHook();
		// get employee bean from container
		MyDAO mydao = (MyDAO) context.getBean("mydao");

		// print the bean
		System.out.println(mydao);
		

	}
}
