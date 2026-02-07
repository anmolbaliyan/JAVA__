package com.rays.collections.sorting;

import java.util.Collections;
import java.util.ArrayList;

public class TestListSortingAndShuffling {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Raman");
		list.add("Gyan");
		list.add("Shivam");
		list.add("Aman");
		list.add("Anant");
		
		list.forEach(System.out::println);
		
		System.out.println("------------------");
		
		Collections.sort(list);
		
		list.forEach(System.out::println);
		
		System.out.println("------------------");
		
		Collections.shuffle(list);
		
		list.forEach(System.out::println);
		
		System.out.println("------------------");

	}

}
