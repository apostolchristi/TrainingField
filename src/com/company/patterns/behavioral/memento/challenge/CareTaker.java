package com.company.patterns.behavioral.memento.challenge;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

	private List<Memento> mementoList = new ArrayList<>();

	public void add(Memento object) {
		 this.mementoList.add(object);
	}

	public Memento get(int index) {
		return this.mementoList.get(index);
	}


}
