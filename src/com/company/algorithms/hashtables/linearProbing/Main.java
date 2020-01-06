package com.company.algorithms.hashtables.linearProbing;


import com.company.algorithms.hashtables.Employee;

/** Linear Probing - when we discover that a position for a hash key value is already occupied we increment the hashed
 value by one, and then we check the resulting index. So in our case, when we come to put in Mary Smith we would discover
 that, oops, hashtable position five is already occupied, and so we're gonna increment five to six and then we'll check
 hashtable six. And if that's already occupied, we'll increment to serven, and we'll keep doing that until we find an
 empty slot, or we've check the entire hashtable. If the hashtable is full then we can't add the employee into the
 hashtable. So it's called like that because each time we increment the index we're doing it in a linear fashion,
 and every increment of the index is called a probe.
 *
 */

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

		hashTable.printHashtable();

		System.out.println("Retrieve key Wilson: " + hashTable.get("Wilson"));
		System.out.println("Retrieve key Smith: " + hashTable.get("Smith"));

		hashTable.remove("Wilson");
		hashTable.remove("Jones");
		hashTable.printHashtable();

		System.out.println("Retrieve key Smith: " + hashTable.get("Smith"));


	}
}
