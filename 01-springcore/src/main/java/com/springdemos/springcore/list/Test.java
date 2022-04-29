package com.springdemos.springcore.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

		public static void main(String[] args) {
			
			//create spring container
			ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/springdemos/springcore/list/config.xml");
			
			//get employee bean from container
			Hospital hospital=(Hospital) context.getBean("hos");
			
			System.out.println(hospital.getDepartments().getClass());
			
			//print the bean
			System.out.println(hospital);
		
		}
}
