package com.company.patterns.creational.singleton.billPugh;

public class SingletonB {

	private int data = 0;

	private SingletonB() {
	}

	public static SingletonB getInstance() {

		return SingletonHelper.uniqueInstance;
	}


	// nested class is referenced after getInstance() is called
	private static class SingletonHelper {

		private static final SingletonB uniqueInstance = new SingletonB();

	}
}
