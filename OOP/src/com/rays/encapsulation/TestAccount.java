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
		
		System.out.println("---------------------------------------------");
		
		Account a2 = new Account();
		
		a2.setaccNumber("2745275436748746");
		a2.setaccType("Current");
		a2.setaccBalance(387652837);
		
		System.out.println(a2.getaccNumber());
		System.out.println(a2.getaccType());
		System.out.println(a2.getaccBalance());
	}

}
