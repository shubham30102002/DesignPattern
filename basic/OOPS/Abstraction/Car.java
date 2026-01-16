package com.learn.designPattern.basic.OOPS.Abstraction;

abstract class Car {
    // abstract methods (what the car can do)
    abstract void start();
    abstract void accelerate();
    abstract void brake();

    // concrete method (common behavior)
    public void turnOff() {
        System.out.println("Car is turned off");
    }
}
