package com.msb.maven;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class customEventListner implements ApplicationEventPublisherAware {
	private ApplicationEventPublisher publisher;

	@Override
	public String toString() {
		customEvent event=new customEvent(this);
		publisher.publishEvent(event);
		return "";
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.publisher=applicationEventPublisher;		
	}
	
	

}

//since we also need the the publisher to get the set, so we need to get the context to the publisher so use applicationeventpublisheraware