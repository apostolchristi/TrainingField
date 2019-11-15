package com.company.patterns.structural.composite.challenge;

import java.util.ArrayList;
import java.util.List;

public class Supervisor implements Faculty {

	private String name;
	private String department;
	private List<Faculty> facultyList;

	public Supervisor(String name, String department) {
		this.name = name;
		this.department = department;
		this.facultyList = new ArrayList<>();;
	}

	@Override
	public String getDetails() {
		return (this.name + " is the " + this.department);
	}

	public void addFaculty(Faculty professor) {
		facultyList.add(professor);
	}

	public void removeFaculty(Faculty professor) {
		facultyList.remove(professor);
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public List<Faculty> getFacultyList() {
		return facultyList;
	}
}
