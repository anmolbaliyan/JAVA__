package com.rays.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestStreamHighestSalary {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(59700);
		list.add(88763);
		list.add(67873);
		list.add(36546);
		list.add(86548);
		
		System.out.println("-----First Highest Salary------");
		list.stream().distinct().sorted(Collections.reverseOrder()).limit(1).forEach(System.out::println);
		
		System.out.println("------Second Highest Salary------");
		list.stream().distinct().sorted(Collections.reverseOrder()).skip(1).limit(1).forEach(System.out::println);
	}

}
