package com.company.patterns.structural.facade.challenge;

interface Menu {
	void showMenu();
}

class NonVegMenu implements Menu {

	public NonVegMenu() {
		System.out.println("Creating a non veg menu");
	}

	@Override
	public void showMenu() {
		System.out.println("Menu items in non veg menu");
	}
}

class BothMenu implements Menu {

	public BothMenu() {
		System.out.println("Creating a BothMenu menu");
	}

	@Override
	public void showMenu() {
		System.out.println("Menu items in BothMenu menu");
	}
}

class VegMenu implements Menu {

	public VegMenu() {
		System.out.println("Creating a veg menu");
	}

	@Override
	public void showMenu() {
		System.out.println("Menu items in veg menu");
	}
}
