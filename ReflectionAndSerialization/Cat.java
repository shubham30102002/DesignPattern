package com.learn.designPattern.ReflectionAndSerialization;

public class Cat {
	private String name;
	private int age;
	
	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void meow() {
		System.out.println("Meow.......");
	}
	
	private void privateMethod() {
		System.out.println("How did you call this private method");
	}
	
	public static void publicStaticMethod() {
		System.out.println("I'm public and static");
	}
	
	private static void privateStaticMethod() {
		System.out.println("I'm private and static, how dare you...");
	}
}
