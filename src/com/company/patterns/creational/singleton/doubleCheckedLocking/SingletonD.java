package com.company.patterns.creational.singleton.doubleCheckedLocking;

public class SingletonD {

	private volatile static SingletonD uniqueInstance = null;
	private int data = 0;

	private SingletonD() {
	}

	public static  SingletonD getInstance() {
		if(uniqueInstance == null) {
			synchronized (SingletonD.class) { //we only synchronize the first time through
				if(uniqueInstance == null) {
					uniqueInstance = new SingletonD();
				}
			}
		}

		return uniqueInstance;
	}
}
