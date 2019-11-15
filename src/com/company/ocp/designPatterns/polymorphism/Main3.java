package com.company.ocp.designPatterns.polymorphism;

public class Main3 {

	public static void main(String[] args) {
		Fish fish = new Fish();
//		Bird bird = (Bird) fish;

		Rodent rodent = new Rodent();
		Capybara capybara =new Capybara();

		System.out.println(rodent instanceof Capybara);

	}
}

 class Bird {}

 class Fish{}

 class Rodent {}

 class Capybara extends Rodent {}
