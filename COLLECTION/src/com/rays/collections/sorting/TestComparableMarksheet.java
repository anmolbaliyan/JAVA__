package com.rays.collections.sorting;

import java.util.Collections;
import java.util.ArrayList;

public class TestComparableMarksheet {
	
	public static void main(String[] args) {
		
		ArrayList<Marksheet> list = new ArrayList<Marksheet>();
		
		list.add(new Marksheet("106" ,"Balram", 100));
		list.add(new Marksheet("102" ,"Ram", 96));
		list.add(new Marksheet("105" ,"Gagan", 50));
		list.add(new Marksheet("103" ,"Raman", 56));
		list.add(new Marksheet("104" ,"Karan", 76));
		list.add(new Marksheet("101" ,"Aman", 78));
		
		list.forEach(System.out::println);
		
		System.out.println("--------sorted--makrsheet--------");
		
		Collections.sort(list);
		
		list.forEach(System.out::println);
		
		
	}

}
