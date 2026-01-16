package com.learn.designPattern.basic.OOPS.Encapsulation;

public class Test {
	public static void main(String[] args) {

		Car car = new Car();

		car.refuel(5); // controlled access
		car.accelerate(20); // no direct speed access
		car.brake();

		System.out.println("Current Speed: " + car.getSpeed());
	}
}
