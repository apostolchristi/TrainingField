package com.company.patterns.creational.builder.challenge.items;

public class Coke extends ColdDrink {

	@Override
	public String name() {
		return "Coke Drink";
	}

	@Override
	public float price() {
		return 10.5f;
	}
}
