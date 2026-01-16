package com.learn.designPattern.basic.OOPS.InheritancePolymorphism;

public class Car {
	protected void start() {
		System.out.println("Car is starting");
	}

	public void fuelType() {
		System.out.println("Car uses fuel");
	}

	// Start car with key
	public void start(String keyType) {
		System.out.println("Car started using " + keyType + " key");
	}

	// Start car with key and temperature condition
	public void start(String keyType, boolean coldStart) {
		if (coldStart) {
			System.out.println("Car started with cold start mode using " + keyType);
		} else {
			System.out.println("Car started normally using " + keyType);
		}
	}
}
