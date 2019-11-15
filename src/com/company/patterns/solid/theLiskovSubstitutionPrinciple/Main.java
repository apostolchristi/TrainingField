package com.company.patterns.solid.theLiskovSubstitutionPrinciple;

abstract class Vehicle {

	abstract int getSpeed ();
	abstract int getCubicCapacity();
}

 class Car extends Vehicle {

	@Override
	int getSpeed() {
		return 0;
	}

	@Override
	int getCubicCapacity() {
		return 0;
	}

	boolean sHatchBack() {
	return true;
	}
}

 class Bus extends Vehicle {

	@Override
	int getSpeed() {
		return 0;
	}

	@Override
	int getCubicCapacity() {
		return 0;
	}

	String getEmergencyExitLocation() {

		return "";
	}
}

public class Main {


	 public static void main(String[] args) {
		 Vehicle vehicle = new Bus();
		 vehicle.getSpeed();

		 vehicle = new Car();
		 vehicle.getCubicCapacity();
	 }



}
