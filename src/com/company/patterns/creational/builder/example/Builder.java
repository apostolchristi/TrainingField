package com.company.patterns.creational.builder.example;

public interface Builder {

	void buildBody();
	void insertWheels();
	void addHeadLights();
	Product getVehicle();
}


//ConcreteBuilder which then will be used as a Product
class Car implements Builder {
	private Product product = new Product();

	@Override
	public void buildBody() {
		product.add("This is a body of a car");
	}

	@Override
	public void insertWheels() {
		product.add("4 wheels are added");
	}

	@Override
	public void addHeadLights() {
		product.add("2 headlights are added");
	}

	@Override
	public Product getVehicle() {
		return product;
	}
}

class MotorCycle implements Builder {
	private Product product = new Product();

	@Override
	public void buildBody() {
		product.add("This is a body of a car");
	}

	@Override
	public void insertWheels() {
		product.add("2 wheels are added");
	}

	@Override
	public void addHeadLights() {
		product.add("1 headlight is added");
	}

	@Override
	public Product getVehicle() {
		return product;
	}
}
