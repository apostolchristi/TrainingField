package com.company.patterns.structural.composite.example1;

//Component
interface Employee {

	 void showEmployeeDetails();
}

class Developer implements Employee {
	private String name;
	private int empID;
	private String position;

	public Developer(String name, int empID, String position) {
		this.name = name;
		this.empID = empID;
		this.position = position;
	}

	@Override
	public void showEmployeeDetails() {
		System.out.println(this.empID + " " + this.name + " " + this.position);
	}
}

class Manager implements Employee {
	private String name;
	private int empID;
	private String position;

	public Manager(String name, int empID, String position) {
		this.name = name;
		this.empID = empID;
		this.position = position;
	}

	@Override
	public void showEmployeeDetails() {
		System.out.println(this.empID + " " + this.name + " " + this.position);
	}
}
