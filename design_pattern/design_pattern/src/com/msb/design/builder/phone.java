package com.msb.design.builder;

public class phone {
	private int ram;
	private int camera;
	private String processor;
	private String os;
	private int battery;

	public phone(int ram, int camera, String processor, String os, int battery) {
		super();
		this.ram = ram;
		this.camera = camera;
		this.processor = processor;
		this.os = os;
		this.battery = battery;
	}

	@Override
	public String toString() {
		return "phone [ram=" + ram + ", camera=" + camera + ", processor=" + processor + ", os=" + os + ", battery="
				+ battery + "]";
	}

}
