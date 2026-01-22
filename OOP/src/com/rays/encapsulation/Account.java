package com.rays.encapsulation;

public class Account {
	
	private String accNumber;
	private String accType;
	private double accBalance;
	
	public void setaccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
	
	public void setaccType(String accType) {
		this.accType = accType;
	}
	
	public void setaccBalance(double accBalance) {
		this.accBalance = accBalance;
	}
	
	public String getaccNumber() {
		return this.accNumber;
	}
	
	public String getaccType() {
		return this.accType;
	}
	
	public double getaccBalance() {
		return this.accBalance;
	}

}
