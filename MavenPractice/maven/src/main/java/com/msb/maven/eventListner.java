package com.msb.maven;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;


@Component
public class eventListner implements ApplicationListener<ApplicationEvent>  {

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("Event: "+ event.toString());
	}


}
