package com.rays.polymorphism;

public class Shape {
	
	protected String color;
	protected int borderwidth;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBorderwidth() {
		return borderwidth;
	}
	public void setBorderwidth(int borderwidth) {
		this.borderwidth = borderwidth;
	}
	//public void area(){
	//	System.out.println("the area is not provided by the class that is required ! ");
	//}
	public double area() {
		return 0.0;
	}
	
	public static Shape getShape(int i) {
		if (i == 1) {
			return new Circle();
		}

		if (i == 2) {
			return new Rectangle();
		}

		if (i == 3) {
			return new Triangle();
		}

		return new Shape();
	}
	
	

}
