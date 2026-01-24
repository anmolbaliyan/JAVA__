package com.rays.overriding;

public class TestShape {
	
	public static void main(String[] args) {
		
		Shape s1 = new Circle();
		
		Circle c = (Circle) s1;
		
		s1.setColor("red");
		s1.setBorderwidth(3);
		c.setRadius(5);
		
		
		System.out.println(s1.getColor());
		System.out.println(s1.getBorderwidth());
		System.out.println(c.getRadius());
		c.area();
		
		System.out.println("=====================");
		
		Shape s2 = new Triangle();
		
		Triangle t = (Triangle) s2;
		
		s2.setColor("black");
		s2.setBorderwidth(7);
		t.setHeight(25);
		t.setBase(67);
		
		System.out.println(s2.getColor());
		System.out.println(s2.getBorderwidth());
		System.out.println(t.getHeight());
		System.out.println(t.getBase());
		t.area();
		
		System.out.println("=====================");
		
		Shape s3 = new Rectangle();
		
		Rectangle r = (Rectangle) s3;
		
		s3.setColor("blue");
		s3.setBorderwidth(5);
		r.setLength(77);
		r.setwidth(34);
		
		System.out.println(s3.getColor());
		System.out.println(s3.getBorderwidth());
		System.out.println(r.getLength());
		System.out.println(r.getwidth());
		r.area();
		
	}

}
