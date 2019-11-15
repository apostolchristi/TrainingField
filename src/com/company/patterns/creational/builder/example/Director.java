package com.company.patterns.creational.builder.example;

/**
 * The Director has the steps that need to happen in order to construct the product
 */
public class Director {

	Builder myBuilder;

	public void construct(Builder builder) {
		this.myBuilder = builder;
		this.myBuilder.buildBody();
		this.myBuilder.insertWheels();
		this.myBuilder.addHeadLights();

	}
}
