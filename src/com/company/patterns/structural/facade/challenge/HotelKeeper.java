package com.company.patterns.structural.facade.challenge;

public class HotelKeeper {

	private VegRestaurant vegRestaurant;
	private NonVegRestaurant nonVegRestaurant;
	private BothRestaurants bothRestaurants;


	public HotelKeeper(VegRestaurant vegRestaurant, NonVegRestaurant nonVegRestaurant, BothRestaurants bothRestaurants) {
		this.vegRestaurant = vegRestaurant;
		this.nonVegRestaurant = nonVegRestaurant;
		this.bothRestaurants = bothRestaurants;
	}

	public void getVeganMenu() {
		Menu vegMenu = vegRestaurant.getMenu();
		vegMenu.showMenu();

	}

	public void getNonVegMenu() {
		Menu nonVegMenu = nonVegRestaurant.getMenu();
		nonVegMenu.showMenu();
	}

	public void getBothmenus() {
		Menu bothMenus = bothRestaurants.getMenu();
		bothMenus.showMenu();
	}
}
