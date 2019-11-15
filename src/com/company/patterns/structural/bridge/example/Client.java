package com.company.patterns.structural.bridge.example;

public class Client {

	public static void main(String[] args) {

		Vehicle vehicle = new Car(new Produce(), new Assemble());
		vehicle.manufacture();

		Vehicle vehicle2 = new Bike(new Produce(), new Assemble());
		vehicle2.manufacture();
	}
}
