package com.msb.maven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Older way
//		Vehicle v=new Car();
//		v.drive();
		
		
//		using dependency injection
		
//		1. using bean factory
//		BeanFactory factory= new XmlBeanFactory("spring.xml));
		
//		2. using application context
		@SuppressWarnings("resource")
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		Vehicle v=(Vehicle)context.getBean("Honda_bike");
		System.out.println(v);

	}

}
