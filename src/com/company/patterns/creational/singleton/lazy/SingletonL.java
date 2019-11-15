package com.company.patterns.creational.singleton.lazy;

public class SingletonL {

	//the private reference to the one and only instance
	private static SingletonL uniqueInstance = null;

	// an instance attribute
	private int data = 0;

	/**
	 * The Singleton Constructor
	 * Note that it is private!
	 * No client can instantiate a Singleton object!
	 */
	private SingletonL() {

	}

	public static SingletonL getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new SingletonL();
		}

		return uniqueInstance;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

}
