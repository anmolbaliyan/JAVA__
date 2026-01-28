package com.rays.constructor;

public class Person {
	
	private String name;
	private String address;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
		System.out.println(this.name);
		System.out.println(this.address);
	}

	//public String getName() {
	//	return name;
	//}

	//public String getAddress() {
	//	return address;
	//}


}
