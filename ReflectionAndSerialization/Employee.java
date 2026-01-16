package com.learn.designPattern.ReflectionAndSerialization;

import java.io.Serializable;

public class Employee implements Serializable {
	private int id;
    private String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
    
    
}
