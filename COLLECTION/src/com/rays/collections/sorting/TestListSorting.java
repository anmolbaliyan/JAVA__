package com.rays.collections.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class TestListSorting {
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add('b');
		list.add('c');
		list.add('a');
		
		System.out.println("List befor sorting : " + list);
		
		Collections.sort(list);
		
		System.out.println("List after sorting : " + list);
		
		Collections.shuffle(list);
		
		System.out.println("List after shuffling : " + list);
	}

}
