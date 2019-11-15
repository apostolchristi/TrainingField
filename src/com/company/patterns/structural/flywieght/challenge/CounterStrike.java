package com.company.patterns.structural.flywieght.challenge;

import java.util.Random;

public class CounterStrike {


	private static String[] playerType = {"Terrorist", "CounterTerrorist"};
	private static String[] weapons = {"AK-47", "M4", "Deagle", "Knife", "Magnum"};

	public static void main(String[] args) {

		PlayerFactory playerFactory = new PlayerFactory();

		for(int i=0; i<10; i++) {
			Player randomPlayer1 = playerFactory.getPlayer(randomPlayerTypeHelper());
			randomPlayer1.assignWeapon(randomWeaponHelper());
			randomPlayer1.mission();

		}
	}

	private static String randomPlayerTypeHelper() {
		Random random = new Random();

		int randomInt = random.nextInt(playerType.length);
		return playerType[randomInt];
	}

	private static String randomWeaponHelper() {
		Random random = new Random();

		int randomInt = random.nextInt(weapons.length);
		return weapons[randomInt];
	}
}
