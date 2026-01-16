package com.learn.designPattern.basic.OOPS.Abstraction;

public class Test {
	public static void main(String[] args) {

		Car car = new ElectricCar(); // abstraction in action

		car.start();
		car.accelerate();
		car.brake();
		car.turnOff();
		
		CarInterface car2 = new PetrolCar();  // interface reference

        car2.start();
        car2.accelerate();
        car2.brake();
	}
}
