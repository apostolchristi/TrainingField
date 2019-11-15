package com.company.patterns.behavioral.strategy.example1;

interface Duck {

	void quack();
	void fly();
	void display();
}

class WildDuck implements Duck {

	QuackBehavior quackBehavior;
	FlyBehavior flyBehavior;
	DisplayBehavior displayBehavior;

	public WildDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior, DisplayBehavior displayBehavior) {
		this.quackBehavior = quackBehavior;
		this.flyBehavior = flyBehavior;
		this.displayBehavior = displayBehavior;
	}

	@Override
	public void quack() {
		this.quackBehavior.quack();
	}

	@Override
	public void fly() {
		this.flyBehavior.fly();
	}

	@Override
	public void display() {
		this.displayBehavior.display();
	}
}
