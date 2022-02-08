package com.msb.maven;

import org.springframework.context.MessageSource;

//import org.springframework.beans.BeansException;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationContextAware;

//public class Brand implements ApplicationContextAware {
public class Brand{
	
//	private ApplicationContext context;
//	@Override
//	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//		// TODO Auto-generated method stub
//		this.context=applicationContext;
//		context.getBean("brand realme");
//	}

	private String name;
	private String price;
	
	private MessageSource messageSource;
	
	public MessageSource getMessageSource() {
		return messageSource;
	}
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	Brand(String price)
	{
		this.price=price;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	Brand(){}
	
	Brand(String name, String price)
	{
		this.name=name;
		this.price=price;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		System.out.println(this.messageSource.getMessage("message", null,"deaul message in  brand", null));
		System.out.println(this.messageSource.getMessage("Brand.tostring", new Object[] {this.getName(),this.getPrice()},"deaul message in brand for tostring", null));

		return "";
	}
	
	
	

}
