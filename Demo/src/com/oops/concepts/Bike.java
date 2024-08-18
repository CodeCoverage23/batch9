package com.oops.concepts;

class Vehicle {

	public void run() {
		System.out.println("Vehicle is running...");
	}

	public void speed() {
		System.out.println("Top speed 220");
	}
}

public class Bike extends Vehicle {

	public static void main(String[] args) {

		// upcasting
		Vehicle bike = new Bike();

		bike.run();
		bike.speed();
		// bike.topSpeed();

	}

	@Override
	public void run() {
		System.out.println("Bike is running...");
	}

	public int topSpeed() {
		return 100;
	}

}
