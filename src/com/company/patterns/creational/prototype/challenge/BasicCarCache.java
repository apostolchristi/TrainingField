package com.company.patterns.creational.prototype.challenge;

import java.util.Hashtable;
import java.util.Map;

public class BasicCarCache {

	private static Map<String, BasicCar> carMap = new Hashtable<>();

	public static BasicCar getCar(String modelType) {
		BasicCar cachedCar = carMap.get(modelType);
		return (BasicCar) cachedCar.clone();
	}

	public static void loadCache() {

		Nano nano = new Nano("Green Nano");
		nano.setPrice(5000.01);
		carMap.put(nano.getModelName(), nano);

		Ford ford = new Ford("Yellow Ford");
		ford.setPrice(2255.53);
		carMap.put(ford.getModelName(), ford);

	}
}
