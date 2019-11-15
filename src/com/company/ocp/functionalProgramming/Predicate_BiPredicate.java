package com.company.ocp.functionalProgramming;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * Predicate return a primitive boolean and can take 1 or 2 parameters
 */
public class Predicate_BiPredicate {

	public static void main(String[] args) {

		Predicate<String> p1 = x -> x.isEmpty();
		Predicate<String> p2 = String::isEmpty;
		System.out.println(p1.test("d"));

		BiPredicate<String, String> b1 = (string, prefix) -> string.startsWith(prefix);
		BiPredicate<String, String> b2 = String::startsWith;
		System.out.println(b1.test("1", "1"));

		Predicate<String> egg = s -> s.contains("egg");
		Predicate<String> brown = s -> s.contains("brown");

		Predicate<String> brownEggs = s -> s.contains("egg") && s.contains("brown");
		Predicate<String> otherEggs = s -> s.contains("egg") && ! s.contains("brown");

		Predicate<String> borwnEggs2 = egg.and(brown);
		Predicate<String> otherEggs2 = egg.and(brown.negate());

	}
}
