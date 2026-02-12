package com.rays.thread;

public class HelloRunnable implements Runnable {

	private String name;

	public HelloRunnable(String name) {

		this.name = name;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " = " + name);
		}

	}

}
