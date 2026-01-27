package com.rays.polymorphism;

public class TestPolymorphismByReturnType {
	
	public static void main(String[] args) {
		Shape[] s = new Shape[3];
		
		s[0] = Shape.getShape(1);
		s[1] = Shape.getShape(2);
		s[2] = Shape.getShape(3);
		
		Circle c = (Circle) s[0];
		c.setRadius(4);

		Rectangle r = (Rectangle) s[1];
		r.setLength(4);
		r.setwidth(8);

		Triangle t = (Triangle) s[2];
		t.setBase(4);
		t.setHeight(4);

		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].area());
		}

	}

}
