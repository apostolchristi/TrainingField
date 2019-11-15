package com.company.patterns.behavioral.state.challenge;

//Cintext
interface Phone {

	void alert();
	void changeState(State state);
}

class Iphone implements Phone {

	State state;

	public Iphone() {
		this.state = new Vibration(this);
	}

	@Override
	public void alert() {
		this.state.alert();
	}

	@Override
	public void changeState(State state) {
		this.state = state;

	}
}
