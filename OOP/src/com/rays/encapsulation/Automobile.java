package com.rays.encapsulation;

public class Automobile {
	
	private String color;
	private int speed;
	private String make;
	public final static int NO_OF_GEARS = 6;
	
	public void setcolor(String color) {
		this.color = color;
	}
	
	public void setspeed(int speed) {
		this.speed = speed; 
	}
	
	public void setmake(String make) {
		this.make = make;
	}
	
	public String getcolor() {
		return this.color;
	}
	
	public int getspeed() {
		return this.speed;
	}
	
	public String getmake() {
		return this.make;
	}
	
	public void brake() {
		if (speed == 0) {
			System.out.println("the bike has already stopped");
		}
		else {
			speed = speed - 17;
		}
	}
	
	public void accelerator() {
		if (speed == 350 || speed > 350) {
			System.out.println("the speed is high apply brake");
		}
		else {
			speed = speed + 25;
		}
	}
	
	public void changeGear(int gear) {
		if(gear > NO_OF_GEARS) {
			System.out.println("no of gear enterd is invalid");
		}
		if (gear == 5) {
			System.out.println("gear switched 5");
			speed = speed +80;
			System.out.println("current speed is: " + speed);
		}
	}

}


