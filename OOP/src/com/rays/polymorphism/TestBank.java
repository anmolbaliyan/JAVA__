package com.rays.polymorphism;

public class TestBank {
	
	public static void main(String[] args) {

/*		Banks b1 = new AxisBank();

		System.out.println(b1.getName());
		System.out.println(b1.InterestRate());

		System.out.println("----------");

		Banks b2 = new HdfcBank();

		System.out.println(b2.getName());
		System.out.println(b2.InterestRate());

		System.out.println("----------");

		Banks b3 = new IciciBank();

		System.out.println(b3.getName());
		System.out.println(b3.InterestRate());
*/
		
		Banks[] banks = new Banks[3];
		
		banks[0] = new AxisBank();
		banks[1] = new HdfcBank();
		banks[2] = new IciciBank();
		
		loanEnquiry(banks);
		
	}
	
	static void loanEnquiry(Banks[] banks) {
		for (Banks b : banks) {
			String name = b.getName();
			double rate = b.InterestRate();
			
			System.out.println(name + "=" + rate);
		}
	}


}
