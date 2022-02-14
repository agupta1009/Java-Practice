package com.msb.design.observer;

import java.util.ArrayList;
import java.util.List;

public class channel {
	private String name;

	private List<subscriber> subs = new ArrayList<>();

	public channel(String name) {
		super();
		this.name = name;
	}

	void add(subscriber sb) {
		subs.add(sb);
		this.name = name;
	}

	void remove(subscriber sb) {
		subs.remove(sb);
	}
	
	void notify_subs()
	{
		for(subscriber s:subs) {
			s.update();
		}
	}
	
	void upload()
	{
		System.out.println("video uploading....");
		notify_subs();
	}

}
