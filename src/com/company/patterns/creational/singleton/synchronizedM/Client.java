package com.company.patterns.creational.singleton.synchronizedM;

public class Client {

	public static void main(String[] args) {

		SingletonS s = SingletonS.getInstance();

		// set the data value
		s.setData(5);

		System.out.println("First reference: " + s);
		System.out.println("Singleton data value is " + s.getData());

		s = null;
		s = SingletonS.getInstance();

		System.out.println("\nFirst reference: " + s);
		System.out.println("Singleton data value is " + s.getData());
	}
}
