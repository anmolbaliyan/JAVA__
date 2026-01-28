package com.rays.inheritances;

public class Rectangle extends Shape {
	private int lenght;
	private int width;

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public int getWidht() {
		return width;
	}

	public void setWidht(int widht) {
		this.width = widht;
	}

	public void area() {
		System.out.println("area of rectangle: " + (lenght * width));
	}


}
