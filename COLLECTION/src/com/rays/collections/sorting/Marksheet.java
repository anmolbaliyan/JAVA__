package com.rays.collections.sorting;

public class Marksheet implements Comparable<Marksheet> {
	
	private String rollno;
	private String name;
	private int phy;
	
	public Marksheet( String rollno, String name, int phy) {
		
		this.rollno = rollno;
		this.name = name;
		this.phy = phy;
	}
	
	@Override
	public int compareTo(Marksheet o) {
		
		if (this.name.equals(o.name)) {
			
			return this.phy - o.phy;
		}
		else if (this.phy == o.phy) {
			return this.rollno.compareTo(o.rollno);
		}
		else {
			
			return this.rollno.compareTo(o.rollno);
		}
	}
	
	@Override
	public String toString() {
		
		return "rollNo: " + rollno + " name: " + name + " phy: " + phy;
		
	}
	

}
