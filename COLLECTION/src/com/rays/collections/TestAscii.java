package com.rays.collections;

public class TestAscii {

	public static void main(String[] args) {

		for (char c = 'a'; c <= 'z'; c++) {
			System.out.println(c + " = " + (int) c);
		}

		System.out.println("-----------------------");

		for (char C = 'A'; C <= 'Z'; C++) {
			System.out.println(C + " = " + (int) C);

		}

		System.out.println("-----------------------");

		char i = '0';

		System.out.println(i + " = " + (int) i);

	}

}
