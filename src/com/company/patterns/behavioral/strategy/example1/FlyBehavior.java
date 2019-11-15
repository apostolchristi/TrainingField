package com.company.patterns.behavioral.strategy.example1;

public interface FlyBehavior {

	void fly();
}

class SimpleFlyBehavior implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("SimpleFlyBehavior");
	}

}

class JetFlyBehavior implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("JetFlyBehavior");
	}
}
