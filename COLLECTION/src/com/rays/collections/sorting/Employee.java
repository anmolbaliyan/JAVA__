package com.rays.collections.sorting;

public class Employee {
	
	public int id;
	public String name;
	public int Salary;
	
	public Employee(int id, String name, int Salary) {
		this.id = id;
		this.name = name;
		this.Salary = Salary;
		
	}
	
	@Override
	public String toString() {
		
		return "id : " + id + "name : " + name + "Salary : " + Salary;
	}

}
