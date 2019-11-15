package com.company.patterns.behavioral.strategy.example1;

public interface QuackBehavior {

	void quack();
}

class SimpleQuackBehavior implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("SimpleQuackBehavior");
	}
}

class NoQuackBehavior implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("NoQuackBehavior");
	}
}



