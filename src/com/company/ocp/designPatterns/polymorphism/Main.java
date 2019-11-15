package com.company.ocp.designPatterns.polymorphism;

public class Main {

	public static void main(String[] args) {

		Oceanographer oceanographer = new Oceanographer();
		oceanographer.checkSound(new Whale());
		oceanographer.checkSound(new Dolphin());
	}
}

interface LivesInOcean {

	void makesound();

}

class Whale implements LivesInOcean {

	@Override
	public void makesound() {
		System.out.println("sing");
	}
}

class Dolphin implements LivesInOcean {

	@Override
	public void makesound() {
		System.out.println("whistle");
	}
}

class Oceanographer {

	public void checkSound(LivesInOcean animal) {
		animal.makesound();
	}
}
