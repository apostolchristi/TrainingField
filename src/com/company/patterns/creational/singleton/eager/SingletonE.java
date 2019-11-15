package com.company.patterns.creational.singleton.eager;

public class SingletonE {

	private static SingletonE uniqueInstance = new SingletonE();
	private int data = 0;

	private SingletonE() {
	}

	public static  SingletonE getInstance() {
		return uniqueInstance;
	}
}
