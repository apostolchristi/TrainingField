package com.company.patterns.structural.composite.challenge;

import java.util.List;

public class Client {

	public static void main(String[] args) {

		Supervisor technologyDean = new Supervisor("Jhon Doe", "Dean of Technology");
		Supervisor chairOfMathDepartment = new Supervisor("Math Prof", "Chair of Math");
		Supervisor chairOfProgramDepratment = new Supervisor("Program Prof", "Chair of Program");

		Professor adjunct = new Adjunct("Adjunct Prof", "Best", 101);
		Professor associate = new Associate("Associate Prof", "LOW", 102);
		Professor fullProfessor = new FullProfessor("Full Prof", "Top", 103);

		chairOfMathDepartment.addFaculty(adjunct);
		chairOfMathDepartment.addFaculty(associate);

		chairOfProgramDepratment.addFaculty(adjunct);
		chairOfProgramDepratment.addFaculty(associate);
		chairOfProgramDepratment.addFaculty(fullProfessor);

		technologyDean.addFaculty(chairOfMathDepartment);
		technologyDean.addFaculty(chairOfProgramDepratment);
		System.out.println(technologyDean.getDetails());

		List<Faculty> chairs = technologyDean.getFacultyList();
		for(Faculty faculty : chairs) {
			System.out.println(faculty.getDetails());
		}

		List<Faculty> mathProfs = chairOfMathDepartment.getFacultyList();
		for(Faculty faculty : chairs) {
			System.out.println(faculty.getDetails());
		}

		List<Faculty> progProfs = chairOfProgramDepratment.getFacultyList();
		for(Faculty faculty : chairs) {
			System.out.println(faculty.getDetails());
		}



	}
}
