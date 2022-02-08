package com.msb.maven;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
//import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class horn implements ApplicationContextAware, BeanNameAware {

	private ApplicationContext context;
	void blow_horn(Vehicle v)
	{
		System.out.println(v + "horn blowed");
	}
	
	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println(name);

	}

	@Override
	public String toString() {
		return "horn [context=" + context + "]";
	}

	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		this.context=applicationContext;

	}

}
