package com.company.algorithms.hashtables.linearProbing;

import com.company.algorithms.hashtables.Employee;

public class StoredEmployee {

	//Row key not hashed
	public String key;
	public Employee employee;

	public StoredEmployee(String key, Employee employee) {
		this.key = key;
		this.employee = employee;
	}
}
