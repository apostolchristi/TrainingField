package com.company.ocp.designPatterns.polymorphism;

public class Main2 {

	public static void main(String[] args) {

		Lemur lemur = new Lemur();
		System.out.println(lemur.hasHair() + " " + lemur.age + " " + lemur.isTailStriped());

		HasTail hasTail = lemur;
		System.out.println(hasTail.isTailStriped());

		Primate primate = lemur;
		System.out.println(primate.hasHair());

		Lemur lemur1 = (Lemur)primate;
		Lemur lemur2 = (Lemur) hasTail;
	}
}
class Primate {

	public boolean hasHair() {
		return true;
	}
}

interface HasTail {
	boolean isTailStriped();
}

class Lemur extends Primate implements HasTail {

	protected int age = 10;

	@Override
	public boolean isTailStriped() {
		return false;
	}
}
