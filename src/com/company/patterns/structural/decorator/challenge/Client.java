package com.company.patterns.structural.decorator.challenge;

public class Client {

	public static void main(String[] args) {


		ShapeComponent redCircle = new RedShapeDecorator(new Circle());
		ShapeComponent redRectangle = new RedShapeDecorator(new Rectangle());
		redCircle.draw();
		redRectangle.draw();


	}
}
