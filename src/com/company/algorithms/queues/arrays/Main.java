package com.company.algorithms.queues.arrays;


import com.company.algorithms.queues.Employee;

/**
 * Abstract data type
 * FIFO - first in , first out (people lines from the supermarket for example)
 * add - also called enqueue - add an item to the end of the queue
 * remove - also called dequeue - remove the item at the front of the queue
 * peek - get the item at the front of the queue, but don't remove it
 *
 * QUEUE - dictates how we can access the data.
 */

public class Main {

	public static void main(String[] args) {

		Employee janeJones = new Employee("Jane", "Jhones", 123);
		Employee johnDoe = new Employee("John", "Doe", 456);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee billEnd = new Employee("Bill", "End", 111);

		ArrayQueue queue = new ArrayQueue(10);

		queue.add(janeJones);
		queue.add(johnDoe);
		queue.add(marySmith);
		queue.add(mikeWilson);

		queue.printQueue();
		System.out.println();

		queue.remove();
		queue.remove();
		queue.printQueue();
		System.out.println();

	}
}
