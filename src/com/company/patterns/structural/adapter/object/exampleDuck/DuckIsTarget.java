package com.company.patterns.structural.adapter.object.exampleDuck;

//Target
public interface DuckIsTarget {

	void quack();
	void fly();
}

class MallardDuck implements DuckIsTarget {

	@Override
	public void quack() {
		System.out.println("MallardDuck Quack");
	}

	@Override
	public void fly() {
		System.out.println("MallarDuck Fly");
	}
}

