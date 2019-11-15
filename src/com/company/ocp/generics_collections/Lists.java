package com.company.ocp.generics_collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");

		System.out.println(list.add("Test"));
		System.out.println(list.remove("2"));
//		list.clear();
		System.out.println(list.size());
		System.out.println(list.contains("5"));
	}
}


