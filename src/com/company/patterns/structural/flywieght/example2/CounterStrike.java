package com.company.patterns.structural.flywieght.example2;

import java.util.Random;

public class CounterStrike {

	public static void main(String[] args) {

		/* Assume that we have a total of 10 players
           in the game. */
		for (int i=0; i<10; i++) {
		Player player = PlayerFactory.getPlayer(getRandomPlayerType());
		player.assignWeapon(getRandomWeapon());
		player.mission();
		}

	}

	// All player types and weopons (used by getRandPlayerType()
	// and getRandWeapon()
	static String[] playrType = {"Terrorist", "CounterTerrorist"};
	static String[] weapons = {"AK-47", "Maverick", "Gut Knife", "Desert Eagle"};

	public static String getRandomPlayerType() {
		Random r = new Random();
		int randInt = r.nextInt(playrType.length);
		return playrType[randInt];
	}

	public static String getRandomWeapon (){
		Random r = new Random();
		int randInt = r.nextInt(weapons.length);
		return weapons[randInt];
	}

}
