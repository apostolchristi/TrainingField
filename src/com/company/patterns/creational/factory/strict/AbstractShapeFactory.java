package com.company.patterns.creational.factory.strict;

//Creator
public abstract class AbstractShapeFactory {

	protected  abstract  Shape factoryMethod();

	public Shape getShape() {
		return factoryMethod();
	}
}

//ConcreteCreator
class RectangleFactory extends AbstractShapeFactory {

	@Override
	protected Shape factoryMethod() {
		return new Rectangle();
	}
}

//ConcreteCreator
class CircleFactory extends AbstractShapeFactory {

	@Override
	protected Shape factoryMethod() {
		return new Circle();
	}
}

//ConcreteCreator
class SquareFactory extends AbstractShapeFactory {

	@Override
	protected Shape factoryMethod() {
		return new Square();
	}
}

