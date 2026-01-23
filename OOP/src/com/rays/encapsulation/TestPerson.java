package com.rays.encapsulation;

import java.time.LocalDate;

public class TestPerson {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.setName("ANMOL");
		p1.setdob(LocalDate.of(2003, 03, 9));
		p1.setAddress("Mahalaxmi Nagar");
		
		p2.setName("ARUN");
		p2.setdob(LocalDate.of(1974, 06, 20));
 		p2.setAddress("Mahalaxmi Nagar");
 		
 		System.out.println(p1.getName());
 		System.out.println(p1.getdob());
 		System.out.println(p1.getAddress());
 		System.out.println("p1 age: " + p1.getAge(p1.getdob()));
 		
 		System.out.println("---------------------------");
 		
 		System.out.println(p2.getName());
 		System.out.println(p2.getdob());
 		System.out.println(p2.getAddress());
 		System.out.println("p2 age: " + p2.getAge(p2.getdob()));
	}

}
