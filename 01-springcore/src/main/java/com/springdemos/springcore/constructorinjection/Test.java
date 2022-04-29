package com.springdemos.springcore.constructorinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		// create spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/constructorinjection/config.xml");

		context.registerShutdownHook();
		// get employee bean from container
		Address add = (Address) context.getBean("add");

		// print the bean
		System.out.println(add);
		System.out.println("1st object hashcode= " + add.hashCode());

	}
}
