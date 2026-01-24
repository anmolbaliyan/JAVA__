package com.rays.overriding;

public class TestBank {
	
	public static void main(String[] args) {

		Banks b1 = new AxisBank();

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

	}


}
