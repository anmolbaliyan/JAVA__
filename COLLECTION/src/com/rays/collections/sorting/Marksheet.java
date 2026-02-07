package com.rays.collections.sorting;

public class Marksheet implements Comparable<Marksheet> {

	private String rollno;
	private String name;
	private int phy;

	public Marksheet(String rollno, String name, int phy) {

		this.rollno = rollno;
		this.name = name;
		this.phy = phy;
	}

	@Override
	public int compareTo(Marksheet o) {

		if (this.phy == o.phy) {

			return this.rollno.compareTo(o.rollno);
		}
		return o.phy - this.phy;
	}

	@Override
	public String toString() {

		return "rollNo: " + rollno + " name: " + name + " phy: " + phy;

	}

}
