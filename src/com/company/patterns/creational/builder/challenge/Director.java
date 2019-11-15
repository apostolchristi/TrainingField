package com.company.patterns.creational.builder.challenge;

import com.company.patterns.creational.builder.challenge.builder.MealBuilder;

public class Director {

	MealBuilder myBuilder;

	public void construct(MealBuilder builder) {
		this.myBuilder = builder;
		this.myBuilder.buildTheBurger();
		this.myBuilder.buildTheDrink();
	}
}
