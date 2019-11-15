package com.company.patterns.creational.builder.challenge.items;

public class Pepsi extends ColdDrink {

	@Override
	public String name() {
		return "Pepsi Drink";
	}

	@Override
	public float price() {
		return 11f;
	}
}
