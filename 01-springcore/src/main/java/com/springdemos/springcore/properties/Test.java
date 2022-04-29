package com.springdemos.springcore.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

		public static void main(String[] args) {
			
			//create spring container
			ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/springdemos/springcore/properties/config.xml");
			
			//get employee bean from container
			Locations loc=(Locations) context.getBean("loc");
			
			System.out.println(loc.getDialect().getClass());
			
			//print the bean
			System.out.println(loc);
		
		}
}
