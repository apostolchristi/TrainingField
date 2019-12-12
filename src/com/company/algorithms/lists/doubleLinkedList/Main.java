package com.company.algorithms.lists.doubleLinkedList;

public class Main {

	public static void main(String[] args) {


		Employee janeJones = new Employee("Jane" ,"Jhones", 123);
		Employee johnDoe = new Employee("John","Doe", 456);
		Employee marySmith = new Employee("Mary" ,"Smith", 22);
		Employee mikeWilson = new Employee("Mike" ,"Wilson", 3245);
		Employee billEnd = new Employee("Bill" ,"End", 111);

		EmployeeDoubleLinkedList list = new EmployeeDoubleLinkedList();

		list.addToFront(janeJones);
		list.addToFront(johnDoe);
		list.addToFront(marySmith);
		list.addToFront(mikeWilson);

		list.printList();
		System.out.println(list.getSize());

		list.addToTail(billEnd);
		list.printList();
		System.out.println(list.getSize());

	}


}
