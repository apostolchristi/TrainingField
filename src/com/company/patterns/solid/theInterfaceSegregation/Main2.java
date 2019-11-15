package com.company.patterns.solid.theInterfaceSegregation;

public class Main2 {
}

interface Restaurant {

	void acceptOnlineOrder();
	void takeTelepohoneOrder();
	void payOnline();
	void walkInCustomerOrder();
	void payInPerson();
}

class OnlineClientIml implements Restaurant {

	@Override
	public void acceptOnlineOrder() {

	}

	@Override
	public void takeTelepohoneOrder() {

	}

	@Override
	public void payOnline() {

	}

	@Override
	public void walkInCustomerOrder() {

	}

	@Override
	public void payInPerson() {

	}
}
