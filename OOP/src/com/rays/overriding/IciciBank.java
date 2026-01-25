package com.rays.overriding;

public class IciciBank extends Banks{
	
	@Override
	public String getName() {
		return "ICICI BANK";
	}
	
	public double InterestRate() {
		return 10.5;

	}

}
