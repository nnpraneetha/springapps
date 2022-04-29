package com.springdemos.springcore.beanscopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		// create spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/beanscopes/config.xml");

		context.registerShutdownHook();
		// get employee bean from container
		Address add = (Address) context.getBean("add");

		// print the bean
		System.out.println(add);
		System.out.println("1st object hashcode= "+add.hashCode());
		
		Address add2 = (Address) context.getBean("add");
		System.out.println("2st object hashcode= "+add2.hashCode());

	}
}
