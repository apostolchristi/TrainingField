package com.company.ocp.designPatterns.functionalProgramming;

import java.util.function.Predicate;

public class Main {

	private static void print(Animal animal, Predicate<Animal> trait) {
		if(trait.test(animal)) {
			System.out.println(animal);
		}
	}

	public static void main(String[] args) {

		print(new Animal("fish", false, true), b -> b.canSwim());
		print(new Animal("kangaroo", true, false), a -> a.canHop());
	}
}

class Animal {
	private String species;
	private boolean canHop;
	private boolean canSwim;

	public Animal(String species, boolean canHop, boolean canSwim) {
		this.species = species;
		this.canHop = canHop;
		this.canSwim = canSwim;
	}

	public boolean canHop() {
		return canHop;
	}

	public boolean canSwim() { return canSwim; }
	public String toString() { return species; }
}

interface CheckTrait {
	boolean test(Animal a);
}
