package com.company.patterns.structural.composite.example2;

public class Client {

	public static void main(String[] args) {

		Employee developer = new Developer("Jason Fedin", 100, "Senior");
		Employee developer2 = new Developer("Myra Fedin", 101, "Intern");
		Employee developer3 = new Developer("Tom Cruise", 102, "Legacy");

		Manager engManager = new Manager("Manager 1", 200 );
		engManager.addEmployee(developer);
		engManager.addEmployee(developer2);

		Manager generalManager = new Manager("Manager 2", 201);
		generalManager.addEmployee(developer3);
		generalManager.addEmployee(engManager);
		generalManager.showEmployeeDetails();






	}
}
