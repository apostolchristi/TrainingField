package com.company.patterns.creational.builder.challenge.builder;

import com.company.patterns.creational.builder.challenge.Meal;


public interface MealBuilder {
	void buildTheBurger();
	void buildTheDrink();
	Meal getTheMeal();


}
