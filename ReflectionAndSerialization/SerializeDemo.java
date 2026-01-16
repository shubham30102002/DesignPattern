package com.learn.designPattern.ReflectionAndSerialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Employee emp = new Employee(101, "Shubham gupta");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"));
		
		oos.writeObject(emp);
		oos.close();
		System.out.println("Object Serialize");
		
		//Deserialization
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"));
		Employee emp2 = (Employee) ois.readObject();
		System.out.println("Object recieved with empId " + emp2.getId() + " and name " + emp2.getName());
	}
}
