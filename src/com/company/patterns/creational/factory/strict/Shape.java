package com.company.patterns.creational.factory.strict;


//Product
interface Shape {

	void draw();
}

//ConcreteProduct
class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Rectangle:: draw() method");
	}
}

//ConcreteProduct
class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Square:: draw() method");
	}
}

//ConcreteProduct
class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Circle:: draw() method");
	}
}
