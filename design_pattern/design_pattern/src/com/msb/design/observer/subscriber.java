package com.msb.design.observer;

public class subscriber {

	private String name;

	public subscriber(String name) {
		super();
		this.name = name;
	}

	subscriber subscibe(channel ch) {
		ch.add(this);
		return this;
	}

	void unsubscribe(channel ch) {
		ch.remove(this);
	}

	void update() {
		System.out.println(this.name+" notified");
	}

}
