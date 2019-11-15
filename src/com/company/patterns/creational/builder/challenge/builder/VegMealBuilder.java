package com.company.patterns.creational.builder.challenge.builder;

import com.company.patterns.creational.builder.challenge.Meal;
import com.company.patterns.creational.builder.challenge.items.Coke;
import com.company.patterns.creational.builder.challenge.items.VegeBurger;

public class VegMealBuilder implements MealBuilder {

	private Meal vegeMeal = new Meal();


	@Override
	public void buildTheBurger() {
		vegeMeal.addItem(new VegeBurger());

	}

	@Override
	public void buildTheDrink() {
		vegeMeal.addItem(new Coke() );

	}

	@Override
	public Meal getTheMeal() {
		return vegeMeal;
	}
}
