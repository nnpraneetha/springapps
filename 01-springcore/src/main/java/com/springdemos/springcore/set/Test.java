package com.springdemos.springcore.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

		public static void main(String[] args) {
			
			//create spring container
			ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/springdemos/springcore/set/config.xml");
			
			//get employee bean from container
			CarDealer cd=(CarDealer) context.getBean("cardealer");
			
			System.out.println(cd.getModels().getClass());
			
			//print the bean
			System.out.println(cd);
		
		}
}
