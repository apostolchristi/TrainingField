package com.company.patterns.structural.composite.example1;

import java.util.ArrayList;
import java.util.List;

//Composite
public class Directory implements Employee {

	private List<Employee> employeeList = new ArrayList<>();

	@Override
	public void showEmployeeDetails() {
		for(Employee emp : employeeList) {
			emp.showEmployeeDetails();
		}
	}

	public void addEmployee(Employee emp) {
		employeeList.add(emp);
	}

	public void removeEmployee(Employee emp) {
		employeeList.remove(emp);
	}
}
