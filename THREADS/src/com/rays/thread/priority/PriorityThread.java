package com.rays.thread.priority;

public class PriorityThread extends Thread{
	
	String name = null;
	
	public PriorityThread(String name) {
		
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " = " + name);
		}
	}

}
