package com.company.patterns.creational.singleton.synchronizedM;

public class SingletonS {

	private static SingletonS uniqueInstance = null;

	private int data = 0;

	private SingletonS() {

	}

	// by adding the synchronized keyword to the getInstance(),
	// we force every thread to wait its turn before it can enter the method.
	public static synchronized SingletonS getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new SingletonS();
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
