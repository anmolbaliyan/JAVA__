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
	public void area(){
		System.out.println("the area is not provided by the class that is required ! ");
	}
	
	

}
