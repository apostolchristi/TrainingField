package com.company.patterns.creational.factory.challenge;

//Creator
public abstract class AbstractAnimalFactory {

	protected abstract Animal factoryMethod();

	public Animal getFactoryMethod() {
		return factoryMethod();
	}
}


//Concrete Creator
class FactoryTiger extends AbstractAnimalFactory {

	@Override
	protected Animal factoryMethod() {
		return new Tiger();

	}

}

class FactoryDuck extends AbstractAnimalFactory {

	@Override
	protected Animal factoryMethod() {
		return new Duck();
	}
}

