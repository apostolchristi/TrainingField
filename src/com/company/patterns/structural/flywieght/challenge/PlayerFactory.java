package com.company.patterns.structural.flywieght.challenge;

import java.util.HashMap;
import java.util.Map;

public class PlayerFactory {

	private Map<String, Player> players;

	public PlayerFactory() {
		players = new HashMap<>();
	}

	public Player getPlayer(String playerType) {
		Player player = null;
		if(players.containsKey(playerType)) {
			player = players.get(playerType);
		} else {
			switch (playerType) {
				case "Terrorist":
					System.out.println("Creating new Terrorist");
					player = new Terrorist();
					break;
				case "CounterTerrorist":
					System.out.println("Creating new CounterTerrorist");
					player = new CounterTerrorist();
					break;
				default:
					System.out.println("Impossible to create this type of player");
			}
			players.put(playerType, player);
		}
		return player;
	}
}
