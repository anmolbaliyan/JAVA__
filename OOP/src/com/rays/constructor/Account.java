package com.rays.constructor;

public class Account {
	
	private String accnumber;
	private String accountType;
	private double balance;

	public Account() {
		System.out.println("this is default constructor");
	}

	public Account(String accnumber, String accountType, double balance) {
		this.accnumber = accnumber;
		this.accountType = accountType;
		this.balance = balance;
		System.out.println(this.accnumber);
		System.out.println(this.accountType);
		System.out.println(this.balance);
	}

	/*public String getNumber() {
		return number;
	}

	public String getAccountType() {
		return accountType;
	}

	public double getBalance() {
		return balance;
	}*/

}
