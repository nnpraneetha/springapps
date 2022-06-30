package com.springdemos.springcore.stereotype.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		// create spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/stereotype/annotations/config.xml");

		// get employee bean from container
		Coach coach = (Coach) context.getBean("coach");

		// print the bean
		System.out.println(coach);
		System.out.println(coach.hashCode());
		
//		Coach coach2 = (Coach) context.getBean("supercoach");
//		System.out.println(coach2.hashCode());

	}
}
