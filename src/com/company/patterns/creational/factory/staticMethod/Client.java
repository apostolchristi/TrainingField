package com.company.patterns.creational.factory.staticMethod;

public class Client {

	public static void main(String[] args) {

		Shape circle = ShapeFactory.getShape("Circle");

		circle.draw();


	}
}


