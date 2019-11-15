package com.company.patterns.structural.facade.challenge;

public class HotelKeeperImpl2 {

	public NonVegMenu getNonVegMenu() {
		NonVegRestaurant nonVegRestaurant = new NonVegRestaurant();
		NonVegMenu nonVegMenu = (NonVegMenu)nonVegRestaurant.getMenu();
		return nonVegMenu;
	}

	public VegMenu getVegMenu() {
		VegRestaurant vegRestaurant = new VegRestaurant();
		VegMenu vegMenu = (VegMenu)vegRestaurant.getMenu();
		return vegMenu;
	}

	public BothMenu getBothMenu() {
		BothRestaurants bothRestaurants = new BothRestaurants();
		BothMenu bothMenu = (BothMenu)bothRestaurants.getMenu();
		return bothMenu;
	}

}
