package com.company.patterns.creational.builder.challenge.items;

public class VegeBurger extends Burger {

	@Override
	public float price() {
		return 25.9f;
	}

	@Override
	public String name() {
		return "Veg Burger";
	}
}
