package com.rays.encapsulation;

public class TestAutomobile {
	public static void main(String[] args) {
		
		Automobile b1 = new Automobile();
		Automobile b2 = new Automobile();
		Automobile b3 = new Automobile();
		
		b1.setcolor("RED");
		b1.setspeed(320);
		b1.setmake("DUCATI");
		b1.brake();
		b1.accelerator();
		b1.changeGear(5);
		
		b2.setcolor("DEEP BLUE");
		b2.setspeed(293);
		b2.setmake("YAMAHA");
		b2.brake();
		b2.accelerator();
		b2.changeGear(5);
		
		b3.setcolor("BLACK");
		b3.setspeed(230);
		b3.setmake("APRILIA");
		b3.brake();
		b3.accelerator();
		b3.changeGear(5);
		
		System.out.println(b1.getcolor());
		System.out.println(b1.getspeed());
		System.out.println(b1.getmake());
		
		System.out.println("----------------------------");
		
		System.out.println(b2.getcolor());
		System.out.println(b2.getspeed());
		System.out.println(b2.getmake());
		
		System.out.println("-----------------------------");
		
		System.out.println(b3.getcolor());
		System.out.println(b3.getspeed());
		System.out.println(b3.getmake());
	}

}
