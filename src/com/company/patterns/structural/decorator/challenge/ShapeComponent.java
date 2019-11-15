package com.company.patterns.structural.decorator.challenge;

abstract class ShapeComponent {


	abstract void draw();

}

class Rectangle extends ShapeComponent {


	@Override
	void draw() {
		System.out.println("Shape: Rectangle");
	}
}

class Circle extends ShapeComponent {

	@Override
	void draw() {
		System.out.println("Shape: Circle");
	}
}
