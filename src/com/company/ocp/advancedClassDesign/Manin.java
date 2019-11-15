package com.company.ocp.advancedClassDesign;

public class Manin {

	public static void main(String[] args) {

	}


	public void feedAnimal(HeavyAnimal animal) {
		if(animal instanceof Hippo) {
			((Hippo)animal).eat();
		} else if(animal instanceof Elephant ) {

		}
	}
}



interface Mother {


}

class HeavyAnimal {

	public void eat() {

	}

}

class Hippo extends HeavyAnimal{

}

class Elephant extends HeavyAnimal implements Mother {

}

