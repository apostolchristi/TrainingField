package com.company.algorithms.lists.doubleLinkedList;



/**
 * When you are working with a singly linked list, you want to insert and delete items at the front of the list,
 * because you have a reference to the head of the list, and so if you want to insert and delete items anywhere else
 * you'd have to start at head and you've got to traverse the entire list to find what you're looking for
 *
 * <--Insert at head -->
 * Create a new Node ""Bill""
 * Assign "Jane" to Bill's next field
 * Assign whatever Jane is pointing to as previous to Bill's previous field
 * Assign "Bill" to Jane's previous field
 * Assign head to "Bill"
 * O(1) time complexity
 *
 *  <--Insert at tail -->
 * Create new node "Bill"
 * Assign tail's mext field to Bill's next field
 * Assign tail to Bill's previous filed
 * Assign tail's next field to "Bill"
 * Assign tail to "Bill"
 * O(1) time complexity
 *
 * <-- Delete from head -->
 * Assign "Jane"to "removeNode"
 * Assign John's previous field to Jane's previous field
 * Assign head to Jane's next field
 * Return "removeNode" from the method
 * O(1) time complexity
 *
 * <-- Delete from tail -->
 *  * Assign "Bill"to "removeNode"
 *  * Assign Mike's next field to Bill's next field
 *  * Assign tail to Bill's previous field
 *  * Return "removeNode" from the method
 *  * O(1) time complexity
 *
 *
 */
public class EmployeeLinkedList {

	private EmployeeNode head;
	private EmployeeNode tail;
	private int size;

	//Add item into the list at it's beginning
	public void addToFront(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		node.setNext(this.head);
		this.head = node;
		size++;
	}

	private void addToTail(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		node.setPrevious(this.tail);
		this.tail = node;

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
