package com.msb.design.composite;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		component ram=new leaf("ram",10000);
		component cpu=new leaf("cpu", 15000);
		component hdd=new leaf("hdd",5000);
		component fan=new leaf("fan",1000);
		component mouse=new leaf("mouse",500);
		component keyboard=new leaf("keyboard",700);
		composite peri=new composite("peripheral devices");
		peri.add(mouse);
		peri.add(keyboard);
		composite computer=new composite("computer");
		composite cabinet=new composite("cabinet");
		computer.add(cabinet);
		computer.add(peri);
		composite mb=new composite("motherboard");
		mb.add(ram);
		mb.add(cpu);
		mb.add(hdd);
		cabinet.add(fan);
		cabinet.add(mb);
		computer.show_price();
		
		
	}

}
