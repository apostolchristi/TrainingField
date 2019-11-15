package com.company.patterns.creational.builder.challenge;

import com.company.patterns.creational.builder.challenge.builder.MealBuilder;
import com.company.patterns.creational.builder.challenge.builder.NonVegMealBuilder;
import com.company.patterns.creational.builder.challenge.builder.VegMealBuilder;

public class Client {

	public static void main(String[] args) {

		Director director = new Director();

		MealBuilder vegMealBuilder = new VegMealBuilder();
		MealBuilder nonVegMealBuilder = new NonVegMealBuilder();

		director.construct(vegMealBuilder);
		Meal vegMeal = vegMealBuilder.getTheMeal();
		vegMeal.showItems();
		System.out.println("Total Cost: " + vegMeal.getCost());

	}
}
