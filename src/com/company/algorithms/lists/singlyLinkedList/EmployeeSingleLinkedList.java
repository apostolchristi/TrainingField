package com.company.algorithms.lists.singlyLinkedList;

/**
 * When you are working with a singly linked list, you want to insert and delete items at the front of the list,
 * because you have a reference to the head of the list, and so if you want to insert and delete items anywhere else
 * you'd have to start at head and you've got to traverse the entire list to find what you're looking for
 */
public class EmployeeSingleLinkedList {

	private EmployeeNode head;
	private int size;

	//Add item into the list at it's beginning
	public void addToFront(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		node.setNext(this.head);
		this.head = node;
		size++;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public EmployeeNode removeFromFront() {
		if (isEmpty()) {
			return null;
		}
		EmployeeNode removedNode = head;
		head = head.getNext();
		size--;
		removedNode.setNext(null);
		return removedNode;
	}

	public void printList() {
		EmployeeNode current = this.head;
		System.out.print("HEAD -> ");
		while (current != null) {
			System.out.print(current);
			System.out.print(" -> ");
			current = current.getNext();
		}
		System.out.print(" null");
	}

	public int getSize() {
		return size;
	}
}
