package com.company.algorithms.lists.singlyLinkedList;

/**
 * It contains a link to the nextNode, and it means that it stores the object reference of the next node
 */
public class EmployeeNode {

	private Employee employee;

	//stores a reference to the next node in a list
	private EmployeeNode next;

	public EmployeeNode(Employee employee) {
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public EmployeeNode getNext() {
		return next;
	}

	public void setNext(EmployeeNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return employee.toString();
	}
}
