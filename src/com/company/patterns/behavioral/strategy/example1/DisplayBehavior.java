package com.company.patterns.behavioral.strategy.example1;

public interface DisplayBehavior {

	void display();

}

class DisplayBehaviorAsText implements DisplayBehavior {

	@Override
	public void display() {
		System.out.println("DisplayBehaviorAsText");
	}
}

class DisplayBehaviorAsGraphic implements DisplayBehavior {

	@Override
	public void display() {
		System.out.println("DisplayBehaviorAsGraphic");
	}
}
