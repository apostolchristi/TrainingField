package com.company.patterns.creational.abstractFactory.staticMethod;

public class Client {

	public static void main(String[] args) throws Exception{

		//get SHAPE factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

		//get an object of Shape
		Shape circle = shapeFactory.getShape("circle");
		circle.draw();

		Shape square = shapeFactory.getShape("square");
		square.draw();



		//get COLOR factory
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

		//get an object of Color
		Color red = colorFactory.getColor("red");
		red.fill();

		Color blue = colorFactory.getColor("blue");
		blue.fill();


	}
}
