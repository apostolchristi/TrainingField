package com.company.patterns.structural.adapter.object.exampleDuck;

//Adaptee
public interface TurkeyIsAdaptee {

	void gobble();
	void fly();
}

class WildTurkey implements TurkeyIsAdaptee {

	@Override
	public void gobble() {
		System.out.println("WildTurkey Gobble");
	}

	@Override
	public void fly() {
		System.out.println("WildTurkey Fly");
	}
}
