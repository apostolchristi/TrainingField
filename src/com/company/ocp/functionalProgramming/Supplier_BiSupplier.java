package com.company.ocp.functionalProgramming;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;


/**
 * Is used when we want to generate or supply values without taking any input
 * Return same type we added in generics
 */
public class Supplier_BiSupplier {

	public static void main(String[] args) {

		Supplier<LocalDate> s1 = LocalDate::now;
		Supplier<LocalDate> s2 = () -> LocalDate.now();

		System.out.println(s1.get());
		System.out.println(s2.get());

		Supplier<StringBuilder> s3 = StringBuilder::new;
		Supplier<StringBuilder> s4 = () -> new StringBuilder();

		Supplier<ArrayList<String>> s5 = ArrayList::new;
		ArrayList<String> a1 = s5.get();
		System.out.println(s5);


	}
}
