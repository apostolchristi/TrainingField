package com.company.patterns.behavioral.memento.challenge;

public class Client {

	public static void main(String[] args) {

		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();

		originator.setState("State #2");
		careTaker.add(originator.save());

		originator.setState("State #3");
		careTaker.add(originator.save());

		originator.setState("State #4");
		careTaker.add(originator.save());
		System.out.println("Current State : " + originator.getState());

		originator.restore(careTaker.get(0));
		System.out.println("First saved State : " + originator.getState());

		originator.restore(careTaker.get(1));
		System.out.println("Second saved State : " + originator.getState());

		originator.restore(careTaker.get(2));
		System.out.println("Third saved State : " + originator.getState());

	}
}
