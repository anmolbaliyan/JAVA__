package com.rays.encapsulation;

import java.time.LocalDate;

public class Person {
	
	private String Name;
	private LocalDate dob;
	private String Address;
	
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
	

}
