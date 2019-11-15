package com.company.patterns.creational.builder.example;

public class Client {
	public static void main(String[] args) {

		Director director = new Director();
		Builder motorCycle = new MotorCycle();

		director.construct(motorCycle);
		Product p1 = motorCycle.getVehicle();
		p1.show();
	}
}
