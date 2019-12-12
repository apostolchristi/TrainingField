package com.company.algorithms.lists.singlyLinkedList;


public class Main {

	public static void main(String[] args) {


		Employee janeJones = new Employee("Jane" ,"Jhones", 123);
		Employee johnDoe = new Employee("John","Doe", 456);
		Employee marySmith = new Employee("Mary" ,"Smith", 22);
		Employee mikeWilson = new Employee("Mike" ,"Wilson", 3245);

		EmployeeSingleLinkedList list = new EmployeeSingleLinkedList();

		System.out.println(list.isEmpty());

		list.addToFront(janeJones);
		list.addToFront(johnDoe);
		list.addToFront(marySmith);
		list.addToFront(mikeWilson);

		System.out.println(list.getSize());
		list.printList();

		list.removeFromFront();
		System.out.println();
		System.out.println(list.getSize());
		list.printList();




	}

}
