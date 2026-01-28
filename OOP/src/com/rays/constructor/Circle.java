package com.rays.constructor;

public class Circle extends Shape {
	
	private int radius;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	
	public Circle(int borderWidth, String color,  int radius) {
		super(borderWidth , color);
		this.radius = radius;
		System.out.println(this.radius);
		
	}

}
