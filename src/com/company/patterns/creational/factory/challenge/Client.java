package com.company.patterns.creational.factory.challenge;

public class Client {
	public static void main(String[] args) throws Exception {

		AnimalFactory animalFactory = new ConcreteAnimalFactory();
		Animal duck = animalFactory.getAnimalType("Duck");
		duck.eat();

		Animal lion = animalFactory.getAnimalType("Lion");
		lion.eat();

		AbstractAnimalFactory duckfactory = new FactoryDuck();
		Animal factoryMethod = duckfactory.getFactoryMethod();
		factoryMethod.eat();

		AbstractAnimalFactory tigerFactory = new FactoryTiger();
		Animal factoryMethod1 = tigerFactory.getFactoryMethod();
		factoryMethod1.eat();

	}



}
