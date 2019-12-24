package com.company.algorithms.queues.arrays;

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
		if(queue.length == back) {
			Employee[] newArray = new Employee[2 * queue.length];
			System.arraycopy(queue, 0, newArray, 0, queue.length);
			queue = newArray;
		}

		queue[back] = employee;
		back++;
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
		return back - front;
	}

	public void printQueue() {
		if(size() == 0) {
			throw new NoSuchElementException();
		}
		for(int i = back-1; i >= front; i--) {
			System.out.println(queue[i]);
		}

	}
}
