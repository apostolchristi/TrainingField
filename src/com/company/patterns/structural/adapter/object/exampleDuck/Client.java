package com.company.patterns.structural.adapter.object.exampleDuck;

public class Client {

	public static void main(String[] args) {

		DuckIsTarget duck = new MallardDuck();
		TurkeyIsAdaptee turkey = new WildTurkey();
		DuckIsTarget turkeyAdapter = new TurkeyIsAdapter(turkey);

		turkey.fly();
		turkey.gobble();

		testDuck(duck);
		testDuck(turkeyAdapter);
	}

	static void testDuck(DuckIsTarget duck) {

		duck.quack();
		duck.fly();
	}

}
