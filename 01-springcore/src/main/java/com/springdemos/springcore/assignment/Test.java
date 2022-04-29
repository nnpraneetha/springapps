package com.springdemos.springcore.assignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

		public static void main(String[] args) {
			
			//create spring container
			ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/springdemos/springcore/assignment/config.xml");
			
			//get employee bean from container
			ShoppingCart cart=(ShoppingCart) context.getBean("cart");
			
			//print the bean
			System.out.println(cart);
		
		}
}
