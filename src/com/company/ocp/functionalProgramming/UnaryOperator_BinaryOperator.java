package com.company.ocp.functionalProgramming;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

/**
 * Are special case of a Function. They require all type parameters to be the same type. It transforms its value into one of the same type
 */
public class UnaryOperator_BinaryOperator {

	public static void main(String[] args) {

		UnaryOperator<String> u1 = String::toUpperCase;
		UnaryOperator<String> u2 = x -> x.toUpperCase();
		System.out.println(u1.apply("test"));
		System.out.println(u2.apply("test"));

		BinaryOperator<String> b1 = String::concat;
		BinaryOperator<String> b2 = (string, toAdd) -> string.concat(toAdd);

	}
}
