package com.company.patterns.creational.prototype.challenge;

public class PrototypepatternEx {

	public static void main(String[] args) {

		BasicCarCache.loadCache();

		BasicCar clonedNano = (BasicCar) BasicCarCache.getCar("Green Nano");
		System.out.println("Car is : " + clonedNano.getModelName() + " and it's price is " + clonedNano.getPrice());

		BasicCar clonedFord = (BasicCar) BasicCarCache.getCar("Yellow Ford");
		System.out.println("Car : " + clonedFord.getModelName() + " and it's price is " + clonedFord.getPrice());
	}
}
