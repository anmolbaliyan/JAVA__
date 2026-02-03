package com.rays.collections.list;

import java.util.Stack;

public class TestStack {
	
	//LAST IN FIRST OUT (LIFO)
	
	public static void main(String[] args) {
		
		Stack s = new Stack();

		for (char c = 'a'; c <= 'z'; c++) {
			s.push(c);
		}
		
		System.out.println("stack: " + s);
		System.out.println(s.peek());
		System.out.println("stack: " + s);
		System.out.println(s.pop());
		System.out.println("stack: " + s);
		
		for (char c = 'a'; c <= 'y'; c++) {
			System.out.println(s.pop());
		}

	}

}
