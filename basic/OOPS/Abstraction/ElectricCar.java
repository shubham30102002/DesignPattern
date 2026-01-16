package com.learn.designPattern.basic.OOPS.Abstraction;

public class ElectricCar extends Car {

	@Override
	void start() {
		System.out.println("Electric motor starts silently");
	}

	@Override
	void accelerate() {
		System.out.println("Electric car accelerates smoothly");
	}

	@Override
	void brake() {
		System.out.println("Regenerative braking applied");
	}

}
