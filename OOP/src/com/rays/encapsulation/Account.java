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
	
	public void deposit ( double amt) {
		this.accBalance = this.accBalance + amt;
		System.out.println("balane after deposit is : " + this.accBalance);
	}
	
	public void withdrawl( double amt) {
		if (amt > this.accBalance) {
			System.out.println("insufficient funds error :");
		}
		else {
			this.accBalance = this.accBalance - amt;
			System.out.println("balane after withdrawl is : " + this.accBalance);
		}
	}
	
	public void fundTransfer(Account target, double amt) {
		if (amt <= 0 ) {
			System.out.println("invalid fund transfer : ");
		}
		if(amt > this.accBalance){
			System.out.println("insufficient fund in account");
		}
		else{
			this.accBalance = this.accBalance - amt;
			target.accBalance = this.accBalance + amt;
			
			System.out.println("fund transfer successful");
			System.out.println("senders balance after transfer : " + this.accBalance);
			System.out.println("receivers balance after transfer : " + this.accBalance);
		}
	}
	
	public void payBill(double amt) {
		if (amt <= 0) {
			System.out.println("invalid amount filled : ");
		}
		if (amt > this.accBalance) {
			System.out.println("insufficient fund :");
		}
		else {
			this.accBalance = this.accBalance - amt;
			System.out.println("bill paid: ");
			System.out.println("remaining balace after paying the bill : " + this.accBalance);
		}
	}

}
