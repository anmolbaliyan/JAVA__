package com.rays.constructor;

public class AutoMobile {
	
	private String color;
	private int speed;
	private String make;
	
	public AutoMobile() {
		// TODO Auto-generated constructor stub
		System.out.println("this is the default constructor");
	}
	
	public AutoMobile(String color, int speed, String make) {
		this.color = color;
		this.make = make;
		this.speed = speed;
		
		System.out.println(this.color);
		System.out.println(this.speed);
		System.out.println(this.make);
		
		
	}

}
