package com.company.ocp.advancedClassDesign.nestedClasses.staticNestedClasses;

public class Enclosing {

	static class Nested {
		private int price = 6;
	}

	public static void main(String[] args) {
		Nested nested = new Nested();
		System.out.println(nested.price);

		Enclosing enclosing = new Enclosing();
	}
}
