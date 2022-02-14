package com.msb.design.builder;

public class builder {

	private int ram;
	private int camera;
	private String processor;
	private String os;
	private int battery;

	public builder setRam(int ram) {
		this.ram = ram;
		return this;
	}

	public builder setCamera(int camera) {
		this.camera = camera;
		return this;
	}

	public builder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}

	public builder setOs(String os) {
		this.os = os;
		return this;
	}

	public builder setBattery(int battery) {
		this.battery = battery;
		return this;
	}

	public phone getphone() {
		return new phone(ram, camera, processor, os, battery);
	}

}
