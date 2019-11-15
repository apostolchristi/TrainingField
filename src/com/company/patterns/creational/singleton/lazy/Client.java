package com.company.patterns.creational.singleton.lazy;

public class Client {

	public static void main(String[] args) {

		SingletonL s = SingletonL.getInstance();

		// set the data value
		s.setData(5);

		System.out.println("First reference: " + s);
		System.out.println("Singleton data value is " + s.getData());

		s = null;
		s = SingletonL.getInstance();

		System.out.println("\nFirst reference: " + s);
		System.out.println("Singleton data value is " + s.getData());
	}
}
