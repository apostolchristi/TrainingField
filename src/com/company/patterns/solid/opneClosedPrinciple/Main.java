package com.company.patterns.solid.opneClosedPrinciple;

 interface Shape {


	 public double calculateArea();
 }
class Rectangle implements Shape{

	public double length;
	public double width;

	@Override
	public double calculateArea() {
		return length * width;
	}
}

class AreaCalculator  {

	public double calculateShapeArea(Shape shape) {

		return shape.calculateArea();
	}
}

class Circle implements Shape {

	public double radius;

	@Override
	public double calculateArea() {
		return (22/7) * radius * radius;
	}
}

public class Main {

	public static void main(String[] args) {

	}
}
