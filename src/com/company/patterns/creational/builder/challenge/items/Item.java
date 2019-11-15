package com.company.patterns.creational.builder.challenge.items;

import com.company.patterns.creational.builder.challenge.packing.Packing;

public interface Item {

	String name();
	Packing packing();
	float price();
}

