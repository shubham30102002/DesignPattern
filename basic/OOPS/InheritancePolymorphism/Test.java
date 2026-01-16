package com.learn.designPattern.basic.OOPS.InheritancePolymorphism;

public class Test {
	public static void main(String[] args) {
		Car car = new ElectricCar(); // Parent reference, child object

		car.start(); // from Car
		car.fuelType(); // from ElectricCar (overridden) Runtime polymorphism
		
		//compile time polymorphism
		car.start(); // no parameters
		car.start("Manual"); // one parameter
		car.start("Smart", true);         // two parameters
	}
}
