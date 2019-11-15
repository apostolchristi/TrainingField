package com.company.ocp.functionalProgramming;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Function is responsible for turning one parameter into a value of a potentially different type and returning it.
 *
  @FunctionalInterface public interface Function<T, R> {
   R apply(T t);
 * }
 */
public class Function_BiFunction {

	public static void main(String[] args) {

		Function<String, String> f1 = String::format;
		Function<String, Integer> f2 = s -> s.length();
		System.out.println(f1.apply("test"));
		System.out.println(f2.apply("tessst"));

		BiFunction<String, String, String> b1 = String::concat;
		BiFunction<String, String, String> b2 = (string, toAdd) -> string.concat(toAdd);
		System.out.println(b1.apply("test", "1"));
		System.out.println(b2.apply("test", "2"));
	}
}
