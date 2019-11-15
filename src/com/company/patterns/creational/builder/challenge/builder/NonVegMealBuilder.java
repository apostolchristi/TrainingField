package com.company.patterns.creational.builder.challenge.builder;

import com.company.patterns.creational.builder.challenge.Meal;
import com.company.patterns.creational.builder.challenge.items.ChickenBurger;
import com.company.patterns.creational.builder.challenge.items.Pepsi;

public class NonVegMealBuilder implements MealBuilder {

	private Meal nonVegMeal = new Meal();

	@Override
	public void buildTheBurger() {
		nonVegMeal.addItem(new ChickenBurger());

	}

	@Override
	public void buildTheDrink() {
		nonVegMeal.addItem(new Pepsi());
	}

	@Override
	public Meal getTheMeal() {
		return nonVegMeal;
	}
}
