package com.company.patterns.creational.abstractFactory.staticMethod;

public class FactoryProducer  {

	public static AbstractFactory getFactory(String choice) throws Exception{
		if(choice == null) {
			throw new Exception("No such choice " + choice + " in our collection");
		}

		if(choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		} else if (choice.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		}
		return null;
	}
}
