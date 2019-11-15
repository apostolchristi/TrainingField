package com.company.patterns.structural.facade.challenge;


 interface Hotel {

	public Menu getMenu();
}

class NonVegRestaurant implements Hotel {

	@Override
	public Menu getMenu() {
		return new NonVegMenu();
	}
}

class VegRestaurant implements Hotel {

	@Override
	public Menu getMenu() {
		return new VegMenu();
	}

}


class BothRestaurants implements Hotel {

	@Override
	public Menu getMenu() {
		return new BothMenu();
	}
}
