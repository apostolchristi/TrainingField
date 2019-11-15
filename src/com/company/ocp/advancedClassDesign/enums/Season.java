package com.company.ocp.advancedClassDesign.enums;
/**
 * Enum is a fixed set of constants
 * Enum is a class that represents an enumeration
 * It's type-safe
 * Behind the scene enum is a class that mainly contains static members.
 * enum can't be extended
 * enum itself has an abstract method
 *
 */
public enum Season  {

	WINTER("COLD"), SUMMER("HOT") {
		@Override
		public void printHours() {
			super.printHours();
		}
	};

	String test;
	Season(String test) {
		this.test = test;
	}

	public void printHours() {
		System.out.println("Print");
	}
}



