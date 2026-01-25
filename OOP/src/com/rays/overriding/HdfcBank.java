package com.rays.overriding;

public class HdfcBank extends Banks{
	
	@Override
	public String getName() {
		return "HDFC BANK";
	}
	
	@Override
	public double InterestRate() {
		return 9.5;
	}

}
