package com.rays.encapsulation;

public class TestAccount {
	public static void main(String[] args) {
		
		Account a1 = new Account();
		
		a1.setaccNumber("487364972562657");
		a1.setaccType("Savings");
		a1.setaccBalance(63871265);
		
		System.out.println(a1.getaccNumber());
		System.out.println(a1.getaccType());
		System.out.println(a1.getaccBalance());
	}

}
