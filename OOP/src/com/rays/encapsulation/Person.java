package com.rays.encapsulation;

import java.time.LocalDate;


public class Person {
	
	private String Name;
	private LocalDate dob;
	private String Address;
	public final static int AVG_AGE = 18;
	
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public void setdob(LocalDate dob) {
		this.dob = dob;
	}
	
	public void setAddress(String Address) {
		this.Address = Address;
	}
	
	public String getName() {
		return this.Name;
	}
	
	public LocalDate getdob() {
		return this.dob;
	}
	
	public String getAddress() {
		return this.Address;
	}
	
	public int getAge(LocalDate dob) {
		LocalDate now =LocalDate.of(2026, 01, 23);
		int age = now.getYear() - dob.getYear();
		return age;
	}

}
