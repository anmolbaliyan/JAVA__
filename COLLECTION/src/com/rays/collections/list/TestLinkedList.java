package com.rays.collections.list;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {
	
	public static void main(String[] args) {
		

		 List list1 = new LinkedList();

		//LinkedList list = new LinkedList();

		list1.add(5);
		list1.add("Ram");
		list1.add("Shyam");

		System.out.println(list1);
		System.out.println(list1.get(2));
		
	}

}
