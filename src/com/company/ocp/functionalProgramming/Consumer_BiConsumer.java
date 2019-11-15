package com.company.ocp.functionalProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * When we want to do something with a parameter but nor return anything
 */
public class Consumer_BiConsumer {

	public static void main(String[] args) {

		List<String> l1 = new ArrayList<>();
		l1.add("1");
		l1.add("2");

		Consumer<String> c1 = System.out::println;
		Consumer<String> c2 = x -> System.out.println(x);

		c1.accept("Annie");
		c2.accept("Annie");


		Map<String, Integer> m1 = new HashMap<>();
		BiConsumer<String, Integer> b1 = (k, v) -> m1.put(k,v);
		BiConsumer<String, Integer> b2 = m1::put;

		b1.accept("Chicken", 2);
		b2.accept("Chicke", 3);
		System.out.println(m1);

	}
}
