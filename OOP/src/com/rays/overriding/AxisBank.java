package com.rays.overriding;

public class AxisBank extends Banks {
	
	@Override
	public String getName() {
		return "AXIS BANK";
	}
	
	@Override
	public double InterestRate() {
		return 11.34;
	}

}
