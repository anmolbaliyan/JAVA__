package com.rays.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {

	public static void main(String[] args) {

		Collection c = new ArrayList();

		c.add(45);
		c.add(76);
		c.add("Ram");
		c.add("a");
		c.add("basilisk");
		c.add(4);
		c.add(86);
		c.add("shyam");
		c.add(55);

		System.out.println(c);
		System.out.println("size of c: " + c.size());
		
		System.out.println("-----------------------");
		
		for (Object o : c) {
			
			System.out.println(o);
		}
		
		System.out.println("-----------------------");
		System.out.println(c.contains(87));
		System.out.println(c.contains("a"));
		System.out.println("-----------------------");
		System.out.println(c.remove(86));
		System.out.println(c.remove("b"));
		System.out.println(c);
		System.out.println("size of c: " + c.size());
	}

}
