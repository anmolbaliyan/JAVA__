package com.rays.polymorphism;

public class TestPolymorphishByArray {
	public static void main(String[] args) {
		Shape[] s = new Shape[3];
		//System.out.println("length of shape array:" + s.length);
		
		s[0] = new Circle();
		s[1] = new Rectangle();
		s[2] = new Triangle();
		
		Circle c = (Circle) s[0];
		c.setRadius(45);
		
		Rectangle r = (Rectangle) s[1];
		r.setLength(76);
		r.setwidth(54);
		
		Triangle t = (Triangle) s[2];
		t.setBase(45);
		t.setHeight(67);
		
		for (int i = 0;i<s.length;i++) {
			
			System.out.println(s[i].area());
		}
		
	}
	

}
