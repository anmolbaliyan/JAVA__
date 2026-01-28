package com.rays.inheritance;

import java.time.LocalDate;

public class TestPerson {
	public static void main(String[] args) {
		
		System.out.println("-----------BUSINESSMAN-------------");
		
		Businessman b = new Businessman();
		
		b.setIncome(732645.36);
		b.setName("NAKUL");
		b.setAddress("DELHI");
		b.setDob(LocalDate.of(2000, 4, 3));
		
		System.out.println("INCOME " + b.getIncome());
		System.out.println("Name" + b.getName());
		System.out.println("Address" + b.getAddress());
		System.out.println("Dob" + b.getDob());
		
		System.out.println("---------------DOCTOR---------------");
		
		Doctor d = new Doctor();
		
		d.setRegistrationNo("HUG4674677GBHe7");
		d.setName("NARESH");
		d.setAddress("DWARKA");
		d.setDob(LocalDate.of(1987, 4, 20));
		
		System.out.println("REGISTRATIONNUMBER " + d.getRegistrationNo());
		System.out.println("NAME" + d.getName());
		System.out.println("Address" + d.getAddress());
		System.out.println("Dob" + d.getDob());
		
		System.out.println("--------------STUDENT--------------");
		
		Student s = new Student();
		
		s.setRollNumber("EN33CD37567");
		s.setName("NAMAN");
		s.setAddress("UP");
		s.setDob(LocalDate.of(2004, 7, 3));
		
		System.out.println("ROLLNUMBER " + s.getRollNumber());
		System.out.println("NAME" + s.getName());
		System.out.println("Address" + s.getAddress());
		System.out.println("Dob" + s.getDob());
	}

}
