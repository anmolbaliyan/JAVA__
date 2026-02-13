package com.rays.java8;

public class TestAnonymousFunction {
	
	public static void main(String[] args) {
		
		HelloFunctionalInterface fi = new HelloFunctionalInterface() {
			
			@Override
			public void say() {
				// TODO Auto-generated method stub
				System.out.println("this is a functional interface");
			}
		};
		
		fi.say();
	}

}
