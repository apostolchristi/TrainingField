package com.company.patterns.behavioral.observer.example2;

import java.util.ArrayList;
import java.util.List;

public interface Observable {
	void registerObserver(Observer observer);
	void removeObserver(Observer observer);
	void notifyObserver(Observer observer);
}

class ConcreteObservable implements Observable {

	private List<Observer> observerList;

	public ConcreteObservable() {
		this.observerList = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer observer) {
		if (!this.observerList.contains(observer))
			this.observerList.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		this.observerList.remove(observer);
	}

	@Override
	public void notifyObserver(Observer observer) {
		for (Observer observer1 : this.observerList) {
			observer.update();
		}
	}
}
