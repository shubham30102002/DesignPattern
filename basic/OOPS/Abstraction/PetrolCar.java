package com.learn.designPattern.basic.OOPS.Abstraction;

public class PetrolCar implements CarInterface {
	@Override
	public void start() {
		System.out.println("Petrol engine starts with ignition");
	}

	@Override
	public void accelerate() {
		System.out.println("Petrol car accelerates by burning fuel");
	}

	@Override
	public void brake() {
		System.out.println("Hydraulic brakes applied");
	}
}
