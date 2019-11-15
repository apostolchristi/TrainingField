package com.company.patterns.solid.theInterfaceSegregation;

public class Main {
}

interface Shape {

	double area();
}

interface  SolidShape {

	double volume();
}

interface ManageShapeInterface {

	double calculate();
}

class Cube implements Shape, SolidShape, ManageShapeInterface {

	@Override
	public double area() {
		return 0;
	}

	@Override
	public double volume() {
		return 0;
	}

	@Override
	public double calculate() {
		return  this.area() + this.volume();
	}
}

class Square implements Shape, ManageShapeInterface {

	@Override
	public double area() {
		return 0;
	}

	@Override
	public double calculate() {
		return this.area();
	}
}

