package com.springdemos.springcore.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

		public static void main(String[] args) {
			
			//create spring container
			ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/springdemos/springcore/map/config.xml");
			
			//get employee bean from container
			Customer cust=(Customer) context.getBean("cust");
			
			System.out.println(cust.getProducts().getClass());
			
			//print the bean
			System.out.println(cust);
		
		}
}
