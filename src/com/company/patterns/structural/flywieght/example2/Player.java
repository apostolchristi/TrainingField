package com.company.patterns.structural.flywieght.example2;

public interface Player {

	void assignWeapon(String weapon);
	void mission();
}

class Terrorist implements Player {

	//Intrinsic Attribute
	private final String mission;

	//Extrinsic Attribute
	private String weapon;

	public Terrorist() {
		mission = "PLANT A BOMB";
	}

	@Override
	public void assignWeapon(String weapon) {
		this.weapon = weapon;
	}

	@Override
	public void mission() {
		System.out.println("Terroris with weapon " + weapon + "|" + " Task is" + mission);
	}
}

class CounterTerrorist implements Player {

	private final String mission;
	private String weapon;

	public CounterTerrorist() {
		mission = "DEFUSE THE BOMB";
	}

	@Override
	public void assignWeapon(String weapon) {
		this.weapon = weapon;
	}

	@Override
	public void mission() {
		System.out.println("CounterTerrorist with weapon " + weapon + "|" + " Task is" + mission);
	}
}
