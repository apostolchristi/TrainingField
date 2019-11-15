package com.company.patterns.creational.factory.staticMethod;

//Product
interface Shape {

	void draw();
}


//concreteProduct
class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}


//concreteProduct
class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}


//concreteProduct
class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}
}
