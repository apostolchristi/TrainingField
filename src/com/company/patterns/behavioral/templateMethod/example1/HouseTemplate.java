package com.company.patterns.behavioral.templateMethod.example1;

abstract class HouseTemplate {

	// template method, final so subclasses cannot override it

	public final void buildHouse() {
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
		System.out.println("House is built");
	}

	//default implementation, hook method
	private void buildWindows() {
		System.out.println("Building Glass Windows");
	}

	private void buildFoundation() {
		System.out.println("Building foundation with cement, iron rods and sand");
	}

	//methods to be implemented by subclasses
	public abstract void buildWalls();
	public abstract void buildPillars();
}

class WoodenHouse extends HouseTemplate {

	@Override
	public void buildWalls() {
		System.out.println("Building wooden Walls");
	}

	@Override
	public void buildPillars() {
		System.out.println("Building wooden Pillars");
	}
}

class GlassHouse extends HouseTemplate {

	@Override
	public void buildWalls() {
		System.out.println("Building Glass Walls");
	}

	@Override
	public void buildPillars() {
		System.out.println("Building Glass Pillars");
	}
}
