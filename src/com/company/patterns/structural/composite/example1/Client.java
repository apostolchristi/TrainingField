package com.company.patterns.structural.composite.example1;

public class Client {

	public static void main(String[] args) {

		Employee developer = new Developer("Jason Fedin", 100, "Senior");
		Employee developer2 = new Developer("Myra Fedin", 101, "Intern");

		Directory engDirectory = new Directory();
		engDirectory.addEmployee(developer);
		engDirectory.addEmployee(developer2);

		Employee manager = new Manager("Manager 1", 200, "SEO");
		Employee manager2 = new Manager("Manager 2", 201, "CTO");

		Directory accDirectory = new Directory();
		accDirectory.addEmployee(manager);
		accDirectory.addEmployee(manager2);

		Directory compayDirectory = new Directory();
		compayDirectory.addEmployee(engDirectory);
		compayDirectory.addEmployee(accDirectory);
		compayDirectory.showEmployeeDetails();
	}
}
