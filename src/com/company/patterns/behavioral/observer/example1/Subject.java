package com.company.patterns.behavioral.observer.example1;

import java.util.ArrayList;
import java.util.List;

interface Subject {

	// methods to register and unregister observers
	void register(Observer object);

	void unRegister(Observer object);

	// method to notify observers of changes
	void notifyObservers();

	//method to get updates from subject, not required but added so observers can query
	Object getUpdate(Observer obj);
}


//concreteSubject
class MyTopic implements Subject {

	private List<Observer> observers;
	private String message;
	private boolean change;

	public MyTopic() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void register(Observer object) {
		if (object == null)
			throw new NullPointerException("Null Observer");
		if (!observers.contains(object))
			observers.add(object);
	}

	@Override
	public void unRegister(Observer object) {
		observers.remove(object);

	}

	@Override
	public void notifyObservers() {

		List<Observer> observersLocal = null;
		if (!this.change) {
			return;
		}

		observersLocal = new ArrayList<>(this.observers);
		this.change = false;

		for(Observer observer : observersLocal) {
			observer.update();
		}
	}

	@Override
	public Object getUpdate(Observer obj) {
		return this.message;
	}

	// metho to post message to the topicm change state (trigger notifications)
	public void postMessage(String msg) {
		System.out.println("Message Posted to Topic: " + msg);
		this.message = msg;
		this.change = true;
		notifyObservers();

	}
}
