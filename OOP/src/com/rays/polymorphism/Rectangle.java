package com.rays.polymorphism;

public class Rectangle extends Shape{
	
	private int length;
	private int width;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getwidth() {
		return width;
	}
	public void setwidth(int breadth) {
		this.width = breadth;
	}
	
	@Override
	public void area() {
		System.out.println(length * width);
	}
	


}
