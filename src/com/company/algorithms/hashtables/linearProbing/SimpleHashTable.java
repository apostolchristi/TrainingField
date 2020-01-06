package com.company.algorithms.hashtables.linearProbing;

import com.company.algorithms.hashtables.Employee;

public class SimpleHashTable {

	private StoredEmployee[] hashtable;

	public SimpleHashTable() {
		hashtable = new StoredEmployee[10];
	}

	public void put(String key, Employee employee) {
		int hashedKey = hashKey(key);    // it will give us the index into the or we map the key they provide for us

		if (occupied(hashedKey)) {
			int stopIndex = hashedKey;    //we need to know when to stop looping

			//Is creating the first value for the first probe
			if (hashedKey == hashtable.length - 1) { //it means that it is full
				hashedKey = 0;    //sets ve very first probe value
			} else {
				hashedKey++;
			}

			// This sets the next probe position and it takes care of the wrapping
			while (occupied(hashedKey) && hashedKey != stopIndex) {
				hashedKey = (hashedKey + 1) % hashtable.length;
			}
		}

		if (occupied(hashedKey)) {    //means that there is already an employee at that position in the array
			System.out.println("Sorry, there's already an employee at position " + hashedKey);
		} else {
			hashtable[hashedKey] = new StoredEmployee(key, employee);    //assign the employee into that(hashedKey) position
		}
	}

	public Employee get(String key) {
		int hashedKey = findKey(key);
		if (hashedKey == -1) {
			return null;
		}
		return hashtable[hashedKey].employee;
	}

	public Employee remove(String key) {
		int hashedKey = findKey(key);
		if (hashedKey == -1) {
			return null;
		}

		Employee employee = hashtable[hashedKey].employee;
		hashtable[hashedKey] = null;

		// Rehashing
		StoredEmployee[] oldHashtable = hashtable; 	//Store current hashtable into a temp variable
		hashtable = new StoredEmployee[oldHashtable.length];
		for (int i = 0; i < oldHashtable.length; i++) {
			if(oldHashtable[i] != null) {
				put(oldHashtable[i].key, oldHashtable[i].employee);
			}

		}

		return employee;
	}


	//Accepting Raw key as a parameter
	private int findKey(String key) {
		int hashedKey = hashKey(key);
		if (hashtable[hashedKey] != null &&
				hashtable[hashedKey].key.equalsIgnoreCase(key)) {
			return hashedKey;
		}

		int stopIndex = hashedKey;    //we need to know when to stop looping
		//Is creating the first value for the first probe
		if (hashedKey == hashtable.length - 1) { //it means that it is full
			hashedKey = 0;    //sets ve very first probe value
		} else {
			hashedKey++;
		}

		// This sets the next probe position and it takes care of the wrapping
		while (hashedKey != stopIndex &&
				hashtable[hashedKey] != null &&
				!hashtable[hashedKey].key.equalsIgnoreCase(key)) {
			hashedKey = (hashedKey + 1) % hashtable.length;
		}

		if (hashtable[hashedKey] != null &&
				hashtable[hashedKey].key.equalsIgnoreCase(key)) {
			return hashedKey;
		}
		else {
			return -1;
		}


	}

	private boolean occupied(int index) {
		return hashtable[index] != null; //if there is something already sitting at that index, then it's occupied
	}

	private int hashKey(String key) {
		return key.length() % hashtable.length;

	}

	public void printHashtable() {
		for (int i = 0; i < hashtable.length; i++) {
			if (hashtable[i] == null) {
				System.out.println("empty");
			} else {
				System.out.println("Position " + i + ": " + hashtable[i].employee);
			}
		}
	}
}
