package com.company.ocp.exceptions;

public class Main1 {

	public static void main(String[] args) {


		test(Summer.WINTER);


	}

	public static void test(Summer s) {
		switch (s) {
			case SPRING:
			case FALL:
				System.out.println("Shorter hours");
				break;
			case SUMMER:
				System.out.println("Longer hours");
				break;
			default:
				assert false: "Invalid season";
		}
	}
}

enum Summer{
	SUMMER, SPRING, FALL, WINTER
}

