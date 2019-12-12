package com.company.algorithms.lists.doubleLinkedList;


/**
 * When you are working with a singly linked list, you want to insert and delete items at the front of the list,
 * because you have a reference to the head of the list, and so if you want to insert and delete items anywhere else
 * you'd have to start at head and you've got to traverse the entire list to find what you're looking for
 * <p>
 * <--Insert at head -->
 * Create a new Node ""Bill""
 * Assign "Jane" to Bill's next field
 * Assign whatever Jane is pointing to as previous to Bill's previous field
 * Assign "Bill" to Jane's previous field
 * Assign head to "Bill"
 * O(1) time complexity
 * <p>
 * <--Insert at tail -->
 * Create new node "Bill"
 * Assign tail's next field to Bill's next field
 * Assign tail to Bill's previous filed
 * Assign tail's next field to "Bill"
 * Assign tail to "Bill"
 * O(1) time complexity
 * <p>
 * <-- Delete from head -->
 * Assign "Jane"to "removeNode"
 * Assign John's previous field to Jane's previous field
 * Assign head to Jane's next field
 * Return "removeNode" from the method
 * O(1) time complexity
 * <p>
 * <-- Delete from tail -->
 * * Assign "Bill"to "removeNode"
 * * Assign Mike's next field to Bill's next field
 * * Assign tail to Bill's previous field
 * * Return "removeNode" from the method
 * * O(1) time complexity
 */
public class EmployeeDoubleLinkedList {

	private EmployeeNode head;
	private EmployeeNode tail;
	private int size;

	//Add item into the list at it's beginning
	public void addToFront(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		node.setNext(head);

		//If we're adding the node to an empty list, we set the tail to a node
		if (head == null) {
			tail = node;
			//If the list is not empty, then we need to set the current head node's previous field to the new node
		} else {
			head.setPrevious(node);
		}

		head = node;
		size++;
	}

	public void addToTail(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		if (tail == null) {
			head = node;
		} else {
			tail.setNext(node);
			node.setPrevious(tail);
		}
		tail = node;
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

		if(head.getNext() == null) {
			tail = null;
		} else {
			head.getNext().setPrevious(null);
		}
		head = head.getNext();

		size--;
		removedNode.setNext(null);
		return removedNode;
	}

	public EmployeeNode removeFromEnd() {
		if(isEmpty()) {
			return null;
		}

		EmployeeNode removeNode= tail;
		//if tail == null then we have only one node in a list
		if(tail.getPrevious() == null) {
			head = null;
		//But if we have more than a one node in a list, the node that's becoming a new tail will be pointing to a next field which is going to be null
		} else {
			tail.getPrevious().setNext(null);
		}
		tail = tail.getPrevious();
		size--;
		removeNode.setPrevious(null);
		return removeNode;
	}

	public void printList() {
		EmployeeNode current = head;
		System.out.print("HEAD -> ");
		while (current != null) {
			System.out.print(current);
			System.out.print(" <=> ");
			current = current.getNext();
		}
		System.out.println(" null");
	}

	public int getSize() {
		return size;
	}
}
