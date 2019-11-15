package com.company.patterns.behavioral.state.challenge;

//State
public interface State {

	void alert();
}

class Vibration implements State {

	Phone phone;

	public Vibration(Phone phone) {
		this.phone = phone;
	}

	@Override
	public void alert() {
		System.out.println("I'm set on vibration");
	}
}


class Silence implements State {

	Phone phone;

	public Silence(Phone phone) {
		this.phone = phone;
	}

	@Override
	public void alert() {
		System.out.println("I'm set on silence");
	}
}
