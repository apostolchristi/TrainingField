package com.company.patterns.behavioral.state.example2;

//Subject
public class TV {

	RemoteControl state;

	public TV() {
		this.state = new Off(this);
	}

	public void setState(RemoteControl obj) {
		this.state = obj;
	}

	public RemoteControl getState() {
		return state;
	}

	public void pressButton() {
		state.pressSwitch(this);
	}
}
