package com.company.patterns.creational.factory.challenge;

//Product
public interface Animal {

	void eat();
}



//ConcreteProduct
class Tiger implements Animal {

	@Override
	public void eat() {
		System.out.println("Tiger says: Halum..Halum");
	}
}

class Duck implements Animal {

	@Override
	public void eat() {
		System.out.println("Duck says: Pack-pack");
	}
}






