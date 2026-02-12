package com.rays.thread.join;

public class JoinThread extends Thread {

	String name = null;

	public JoinThread(String name) {
		
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		for (int i = 1; i <+ 5; i++) {
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i + " = " + name);
		}
	}
}
