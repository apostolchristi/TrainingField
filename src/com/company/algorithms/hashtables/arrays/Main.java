package com.company.algorithms.hashtables.arrays;

import com.company.algorithms.hashtables.Employee;

public class Main {

	public static void main(String[] args) {

		Employee janeJones = new Employee("Jane", "Jhones", 123);
		Employee johnDoe = new Employee("John", "Doe", 456);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee billEnd = new Employee("Bill", "End", 111);

		SimpleHashTable hashTable = new SimpleHashTable();
		hashTable.put("Jones",janeJones);
		hashTable.put("Doe",johnDoe);
		hashTable.put("Wilson",mikeWilson);
		hashTable.put("Smith",marySmith);

//		hashTable.printHashtable();

		System.out.println("Retrieve key Wilson: " + hashTable.get("Wilson"));
	}
}
