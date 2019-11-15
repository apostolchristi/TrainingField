package com.company.patterns.structural.adapter.object.exampleCalculator;
//Target
public interface CalculatorInterface {

	double getArea(Rectangle r);
}


//Adaptee
class Calculator implements CalculatorInterface {

	@Override
	public double getArea(Rectangle rectangle) {
		return rectangle.length * rectangle.with;
	}
}
