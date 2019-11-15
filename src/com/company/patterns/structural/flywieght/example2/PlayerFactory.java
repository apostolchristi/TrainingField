package com.company.patterns.structural.flywieght.example2;

import java.util.HashMap;
import java.util.Map;

public class PlayerFactory {

	private static Map<String, Player> hm = new HashMap<>();

	public static Player getPlayer(String type) {
		Player player = null;
		if(hm.containsKey(type)) {
			player = hm.get(type);
		}else {
			switch (type) {
				case "Terrorist":
					System.out.println("Terrorist Created");
					player = new Terrorist();
					break;
				case "CounterTerrorist":
					System.out.println("CounterTerrorist Created");
					player = new CounterTerrorist();
					break;
				default:
					System.out.println("Unreachable code!");
			}
			hm.put(type, player);
		}
		return player;
	}
}
