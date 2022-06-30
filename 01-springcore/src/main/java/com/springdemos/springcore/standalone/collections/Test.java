package com.springdemos.springcore.standalone.collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

		public static void main(String[] args) {
			
			//create spring container
			ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/springdemos/springcore/standalone/collections/config.xml");
			
			//get employee bean from container
			ProductsList pro=(ProductsList) context.getBean("pro");
			
			System.out.println(pro.getProductNames().getClass());
			
			//print the bean
			System.out.println(pro);
		
		}
}
