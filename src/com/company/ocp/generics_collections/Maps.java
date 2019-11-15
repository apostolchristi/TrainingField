package com.company.ocp.generics_collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		System.out.println(map.put("Two", 2));
		helper(map);

		System.out.println(map.isEmpty());
		helper(map);

		System.out.println(map.size());
		helper(map);

		System.out.println(map.get(""));
		helper(map);

		for(Object obj : map.values()) {
			System.out.print(obj + " ");
		}

	}













	public static void helper(Map<String, Integer> map) {
		for(Object obj : map.keySet()) {
			System.out.print(obj + " ");
		}
		System.out.println("\n-----------------");
	}
}
