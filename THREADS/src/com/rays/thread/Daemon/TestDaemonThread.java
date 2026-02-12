package com.rays.thread.Daemon;

public class TestDaemonThread {

	public static void main(String[] args) {

		BackGroundThread t1 = new BackGroundThread("Daemon Thread");

		t1.start();

		for (int i = 1; i <= 100; i++) {

			try {

				Thread.sleep(100);

			} catch (InterruptedException e) {

				e.printStackTrace();

			}

			System.out.println(i + " main");
		}
	}

}
