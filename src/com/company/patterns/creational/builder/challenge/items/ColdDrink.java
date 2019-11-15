package com.company.patterns.creational.builder.challenge.items;

import com.company.patterns.creational.builder.challenge.packing.Bottle;
import com.company.patterns.creational.builder.challenge.packing.Packing;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}

}




