package com.company.patterns.structural.composite.challenge;

interface Faculty {

	String getDetails();

}

abstract class Professor implements Faculty {

	protected String name;
	protected String position;
	protected double officeNumber;

	public Professor(String name, String position, double officeNumber) {
		this.name = name;
		this.position = position;
		this.officeNumber = officeNumber;
	}

	@Override
	public String getDetails() {
		return (name + " is the " + position);
	}
}

class Adjunct extends Professor {

	public Adjunct(String name, String position, double officeNumber) {
		super(name, position, officeNumber);
	}

	@Override
	public String getDetails() {
		return "Adjunct";
	}
}

class Associate extends Professor {

	public Associate(String name, String position, double officeNumber) {
		super(name, position, officeNumber);
	}

	@Override
	public String getDetails() {
		return "Associate";
	}

}

class FullProfessor extends Professor {

	public FullProfessor(String name, String position, double officeNumber) {
		super(name, position, officeNumber);
	}

	@Override
	public String getDetails() {
		return "FullProfessor";
	}
}


