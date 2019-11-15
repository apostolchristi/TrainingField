package com.company.patterns.creational.prototype.challenge;

public abstract class BasicCar implements Cloneable {

	protected String modelName;
	protected Double price;

	public BasicCar() {
	}

	public BasicCar(String modelName) {
		this.modelName = modelName;
		this.price = 1200.00;
	}

	public abstract void starCar();

	@Override
	protected Object clone()  {
		Object clone = null;

		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}

	public Double getPrice() {
		return this.price;
	}

	protected void setPrice(Double price) {
		this.price += price;
	}

	public String getModelName() {
		return modelName;
	}

	protected void setModelName(String modelName) {
		this.modelName = modelName;
	}


}


class Nano extends BasicCar {

	public Nano() {
	}

	public Nano(String model) {
		super(model);
	}

	@Override
	public void starCar() {
		System.out.println("Inside the Nano::startCar() method");
	}
}

class Ford extends BasicCar {

	public Ford() {
	}

	public Ford(String model) {
		super(model);
	}

	@Override
	public void starCar() {
		System.out.println("Inside the Ford::startCar() method");
	}
}
