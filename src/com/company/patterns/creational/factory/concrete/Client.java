package com.company.patterns.creational.factory.concrete;

public class Client {

	public static void main(String[] args) {

		ShapeFactory shapeFactory = new ShapeFactory();
		Shape circle = shapeFactory.getShape("circle");
		circle.draw();
	}
}


