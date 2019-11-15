package com.company.patterns.creational.builder.example;

import java.util.LinkedList;

/**
 * Product is the end result and it could be a car or motorcycle
 * This is going to use a data structure and add things to the data structure as methods gets called
 */
public class Product {

	private LinkedList<String> parts;

	public Product() {
		parts = new LinkedList<>();
	}

	public void add(String part) {
		parts.addLast(part);
	}

	public void show() {
		System.out.println("\n Product completed as below");

		for(String part : parts) {
			System.out.println(part);
		}
	}
}
