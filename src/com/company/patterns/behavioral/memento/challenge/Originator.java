package com.company.patterns.behavioral.memento.challenge;

public class Originator {

	private String state;

	public Originator() {
		this.state = state;
	}

	public Memento save() {
		return new Memento(this.state);
	}

	public void restore(Object object) {
		Memento memento = (Memento) object;
		this.state = memento.getState();
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}


}
