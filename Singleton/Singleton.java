package com.learn.designPattern.Singleton;

public class Singleton implements Cloneable{
	private static Singleton instance;
	
	private Singleton() {
		
	}
	// clone method creates a new object that replicates all the current attributes and state of the original
	@Override
	public Singleton clone() {
		return new Singleton();
	}
	
	public static Singleton getInstance() { 
		if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
		return instance;
	}
}
