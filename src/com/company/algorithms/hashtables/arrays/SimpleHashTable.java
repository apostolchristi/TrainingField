package com.company.algorithms.hashtables.arrays;

import com.company.algorithms.hashtables.Employee;

public class SimpleHashTable {

	private Employee[] hashtable;

	public SimpleHashTable() {
		hashtable = new Employee[10];
	}

	public void put(String key, Employee employee) {
		int hashedKey = hashKey(key); 	// it will give us the index into the or we map the key they provide for us
		if(hashtable[hashedKey] != null) { 	//means that there is already an employee at that position in the array
			System.out.println("Sorry, there's already an employee at position " + hashedKey);
		} else {
			hashtable[hashedKey] = employee; 	//assign the employee into that(hashedKey) position
		}
	}

	public Employee get(String key) {
		int hashedKey = hashKey(key);
		return hashtable[hashedKey];
	}

	public void printHashtable() {
		for (int i = 0; i < hashtable.length; i++) {
			System.out.println(hashtable[i]);
		}
	}

	private int hashKey(String key) {
		return key.length() % hashtable.length;

	}
}
