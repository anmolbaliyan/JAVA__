package com.rays.java8;

public class TestSumFunctionalInt {

	public static void main(String[] args) {

		SumFunctionalInt s = (a, b) -> {
			return a + b;
		};

		System.out.println(s.sum(57, 76));

		System.out.println("---------------");

		SumFunctionalInt c = new SumFunctionalInt() {

			@Override
			public int sum(int a, int b) {
				// TODO Auto-generated method stub
				return a + b;
			}
		};
		System.out.println(c.sum(5, 7));
	}

}
