package com.company.patterns.creational.abstractFactory.staticMethod;


public abstract class AbstractFactory {

	abstract Color getColor(String color) throws Exception;
	abstract Shape getShape(String shapeType) throws Exception;
}

class ShapeFactory extends AbstractFactory  {

	@Override
	Shape getShape(String shapeType) throws Exception {
		if(shapeType == null) {
			throw new Exception("No such shapeType " + shapeType + " in our collection");

		}

		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}

	@Override
	Color getColor(String color) {
		return null;
	}
}


class ColorFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		if(color == null) {
			return null;
		}

		if (color.equalsIgnoreCase("RED")) {
			return new Red();
		} else if (color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}else if (color.equalsIgnoreCase("GREEN")) {
			return new Green();
		}
		return null;
	}

	@Override
	Shape getShape(String shapeType) {
		return null;
	}
}

