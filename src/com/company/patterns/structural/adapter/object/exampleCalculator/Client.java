package com.company.patterns.structural.adapter.object.exampleCalculator;

public class Client {

	public static void main(String[] args) {

		Triangle triangle = new Triangle(20, 10);

		CalculatorInterface calculatorAdapter = new CalculatorAdapter(triangle);
		System.out.println(calculatorAdapter.getArea(null));
	}
}
