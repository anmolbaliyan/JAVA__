package com.rays.thread.join;

public class TestJoinWithThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		JoinThread t1 = new JoinThread("Ram");
		JoinThread t2 = new JoinThread("Shyam");
				
		t1.start();
		
		t1.join();
		
		t2.start();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " main: thread..");
		}
		
	}

}
