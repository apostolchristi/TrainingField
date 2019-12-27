package com.company.algorithms.queues.circular;


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

		ArrayQueue queue = new ArrayQueue(5);

		queue.add(janeJones);
		queue.add(johnDoe);
		queue.remove();
		queue.add(marySmith);
		queue.remove();
		queue.add(mikeWilson);
		queue.remove();
		queue.add(billEnd);
		queue.remove();
		queue.add(janeJones);


		queue.printQueue();








	}
}
