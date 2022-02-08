package com.msb.maven;

import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
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
		
//		@SuppressWarnings("resource")
//		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
//		Vehicle v=(Vehicle)context.getBean("Honda bike");
//		System.out.println(v);
//		v=(Vehicle) context.getBean("Tata Car");
//	
//		System.out.println(v);
//		v=(Vehicle) context.getBean("scooty");
//		System.out.println(v);
//		v=(Vehicle) context.getBean("reno");
//		System.out.println(v);
//		horn h=(horn) context.getBean("horn1");
//		h.blow_horn(v);	
		
		
//		AbstractApplicationContext context= new ClassPathXmlApplicationContext("spring2.xml");
		ApplicationContext context=new ClassPathXmlApplicationContext("spring2.xml");
//		context.registerShutdownHook();
//		Vehicle v=(Vehicle) context.getBean("honda car");
//		System.out.println(v);
//		Brand b=(Brand) context.getBean("tata");
//		System.out.println(b);
//		horn h1=(horn) context.getBean("horn1");
//		System.out.println(h1);
//		context.close();
//		System.out.println(context.getMessage("greeting", null, "hello default message", null));
		
		
//			event listner custom
		customEventListner obj= (customEventListner)context.getBean("custom event");
		System.out.println(obj);

	}

}
