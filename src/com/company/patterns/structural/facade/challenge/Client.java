package com.company.patterns.structural.facade.challenge;

public class Client {

	public static void main(String[] args) {

		VegRestaurant vegRestaurant = new VegRestaurant();
		NonVegRestaurant nonVegRestaurant = new NonVegRestaurant();
		BothRestaurants bothRestaurants = new BothRestaurants();

		HotelKeeper menus = new HotelKeeper(vegRestaurant, nonVegRestaurant, bothRestaurants);
		menus.getNonVegMenu();

		menus.getVeganMenu();
		menus.getBothmenus();

		System.out.println("********************************************************************");

		HotelKeeperImpl2 hotelKeeperImpl2 = new HotelKeeperImpl2();

		BothMenu bothMenu = hotelKeeperImpl2.getBothMenu();
		bothMenu.showMenu();

		NonVegMenu nonVegMenu = hotelKeeperImpl2.getNonVegMenu();
		nonVegMenu.showMenu();

		VegMenu vegMenu = hotelKeeperImpl2.getVegMenu();
		vegMenu.showMenu();

	}
}
