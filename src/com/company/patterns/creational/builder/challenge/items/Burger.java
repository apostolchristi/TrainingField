package com.company.patterns.creational.builder.challenge.items;


import com.company.patterns.creational.builder.challenge.packing.Packing;
import com.company.patterns.creational.builder.challenge.packing.Wrapper;


public abstract class Burger implements Item {

	public Packing packing() {
		return new Wrapper();
	}

 }








