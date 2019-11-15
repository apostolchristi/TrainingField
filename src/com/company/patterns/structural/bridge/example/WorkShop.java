package com.company.patterns.structural.bridge.example;

//Implementor
 abstract class WorkShop {

	 public abstract void work();

}

//ConcreteImplementorA
class Produce extends WorkShop {

	@Override
	public void work() {
		System.out.println("From Produce::work() method");
	}
}

//ConcreteImplementorB
class Assemble extends WorkShop {

	@Override
	public void work() {
		System.out.println("From Assemble::work() method");
	}
}
