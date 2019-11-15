package com.company.patterns.structural.flywieght.challenge;

public interface Player {

	void assignWeapon(String weapon);
	void mission();
}


class Terrorist implements Player {

	private final String mission;
	private String weapon;

	public Terrorist() {
		mission = "PLANT THE BOMB";
	}

	@Override
	public void assignWeapon(String weapon) {
		this.weapon = weapon;
	}

	@Override
	public void mission() {
		System.out.println("This Terrorist has weapon " + weapon + "|" + " and his mission is to " + mission);
	}
}

class CounterTerrorist implements Player{

	private final String mission;
	private String weapon;

	public CounterTerrorist() {
		mission = "DEFUSE THE BOMB";
	}

	@Override
	public void assignWeapon(String weapon) {

	}

	@Override
	public void mission() {
		System.out.println("This CounterTerrorist has weapon " + weapon + "|" + " and his mission is to " + mission);
	}
}
