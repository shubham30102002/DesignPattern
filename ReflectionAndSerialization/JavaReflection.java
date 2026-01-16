package com.learn.designPattern.ReflectionAndSerialization;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class JavaReflection {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		Cat myCat = new Cat("Stella", 3);
		Field[] catFields = myCat.getClass().getDeclaredFields();
		for (Field field: catFields) {
//			System.out.println(field.getName());	
			if(field.getName().equals("name")) {
				field.setAccessible(true);
				field.set(myCat, "Foxy");
			}
		}
		
		
		Method[] catMethods = myCat.getClass().getDeclaredMethods();
		for(Method method : catMethods) {
//			System.out.println(method.getName());
			if(method.getName().equals("privateStaticMethod")) {
				method.setAccessible(true);
				method.invoke(Cat.class);
			}
		}
		System.out.println(myCat.getName());
	}
}
