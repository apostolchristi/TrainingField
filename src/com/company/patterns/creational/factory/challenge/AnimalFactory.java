package com.company.patterns.creational.factory.challenge;

public abstract class AnimalFactory {

	public abstract Animal getAnimalType(String type) throws Exception;

}

class ConcreteAnimalFactory extends AnimalFactory {

	@Override
	public Animal getAnimalType(String type) throws Exception {

		switch (type) {
			case "Tiger":
				return new Tiger();
			case "Duck":
				return new Duck();
			default:
				throw new Exception("Animal Type: " + type + " cannot be instatiated");
		}
	}
}
