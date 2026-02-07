package com.rays.collections.sorting;

import java.util.ArrayList;
import java.util.Collections;


public class TestMarksheet {
	
	public static void main(String[] args) {
		
		Marksheet m1 = new Marksheet("101", "Ram", 45);
		Marksheet m2 = new Marksheet("102", "Shyam", 78);
		Marksheet m3 = new Marksheet("106", "kamal", 88);
		Marksheet m4 = new Marksheet("103", "Aman", 88);
		Marksheet m5 = new Marksheet("104", "Pawan", 35);
		Marksheet m6 = new Marksheet("105", "Rakesh", 55);
		
		ArrayList<Marksheet> list = new ArrayList<Marksheet>();
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		list.add(m6);
		
		System.out.println(list);
		
		Collections.sort(list);
		
		list.forEach(System.out::println);
		
	}

}
