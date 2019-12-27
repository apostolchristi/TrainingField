package com.company.algorithms.queues.circular;

import com.company.algorithms.queues.Employee;

import java.util.NoSuchElementException;

public class ArrayQueue {

	private Employee[] queue;
	private int front;
	private int back;

	public ArrayQueue(int capacity) {
		queue = new Employee[capacity];
	}

	public void add(Employee employee) {
		int numItems = size();	//we're gonna to use that later after we've resized the array to set the back pointer
		if(queue.length -1 == size()) {
			Employee[] newArray = new Employee[2 * queue.length];
			System.arraycopy(queue, front, newArray, 0, queue.length);
			System.arraycopy(queue, 0, newArray, queue.length-front, back);
			queue = newArray;
			front = 0;
			back = numItems;
		}

		// 0	jane
		// 1	john
		// 2 - 	  -back
		// 3 -mike 	-fromt
		// 4 	-bill

		//0 mike
		//1 bill
		//2 jane
		//3 john
		//4 - back
		//5
		//6

		queue[back] = employee;
		if(back < queue.length) {
			back++;
		} else {
			back = 0;
		}
	}

	public Employee remove() {
		if(size() == 0) {
			throw new NoSuchElementException();
		}
		Employee employee = queue[front];
		queue[front] = null;
		front++;
		if(size() == 0) {
			front = 0;
			back = 0;
		}else if (front == queue.length) { //if there are still items on the que
			front = 0;
		}
		return employee;
	}

	public Employee peek() {
		if(size() == 0) {
			throw new NoSuchElementException();
		}
		return queue[front];
	}

	public int size() {
		if(front <= back) { //then we know the queue hasn't wrapped because back is still greater than front
			return back - front;
		} else {
			return back - front + queue.length; // by adding queue.length we can adjust the negative number to the actual number of items on the queue
		}
	}

	public void printQueue() {
		if(size() == 0) {
			throw new NoSuchElementException();
		}
		if(front <= back) {
			for(int i = front; i < back; i++) {
				System.out.println(queue[i]);
			}
		} else {
			for (int i = front; i < queue.length; i++) {
				System.out.println(queue[i]);
			}
			for (int i = 0; i < back; i++) {
				System.out.println(queue[i]);
			}
		}


	}
}
