package com.company.patterns.structural.adapter.object.exampleDuck;


//Adapter
public class TurkeyIsAdapter implements DuckIsTarget {

	TurkeyIsAdaptee turkey;

	public TurkeyIsAdapter(TurkeyIsAdaptee turkey) {
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		this.turkey.gobble();
	}

	@Override
	public void fly() {
		for(int i=0; i<5; i++) {
			this.turkey.fly();
		}
	}
}
