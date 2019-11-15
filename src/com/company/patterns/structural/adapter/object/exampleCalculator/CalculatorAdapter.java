package com.company.patterns.structural.adapter.object.exampleCalculator;

//Adapter
public class CalculatorAdapter implements CalculatorInterface {

	//Adaptee
	Calculator calculator;
	Triangle triangle;

	public CalculatorAdapter(Triangle triangle) {
		this.triangle = triangle;
	}

	//Will allow us to convert the Rectangle to a Triangle
	@Override
	public double getArea(Rectangle r) {
		calculator = new Calculator();

		Rectangle rectangle = new Rectangle();

		rectangle.length = triangle.base;
		rectangle.with = 0.5 * triangle.height;

		return calculator.getArea(rectangle);

	}
}
