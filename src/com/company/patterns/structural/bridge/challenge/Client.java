package com.company.patterns.structural.bridge.challenge;

public class Client {

	public static void main(String[] args) {

		System.out.println("*****BRIDGE PATTERN******");

		Shape triangle = new Triangle(new GreenCircle());
		helper(triangle, 20, 60);

		Shape rectangle = new Rectangle(new RedCircle());
		helper(rectangle, 50, 100);



	}

	public static void helper(Shape shape, int border, int increment) {
		System.out.println("\nColoring " + shape.shapeName);
		shape.drawShapes(border);
		shape.modifyBorders(border, increment);
	}
}
