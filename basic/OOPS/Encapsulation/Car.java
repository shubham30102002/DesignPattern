package com.learn.designPattern.basic.OOPS.Encapsulation;

class Car {

	// private data (hidden)
	private int speed;
	private int fuelLevel;

	// public methods to access data
	public void accelerate(int value) {
		if (fuelLevel <= 0) {
			System.out.println("Cannot accelerate, no fuel");
			return;
		}
		speed += value;
		fuelLevel--;
	}

	public void brake() {
		speed = Math.max(0, speed - 10);
	}

	public int getSpeed() {
		return speed;
	}

	public void refuel(int fuel) {
		if (fuel > 0) {
			fuelLevel += fuel;
		}
	}
}

