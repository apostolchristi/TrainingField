package com.company.patterns.creational.abstractFactory.challenge;

public class MovieProducer {

	public static MovieFactory getMovieFactory(String type) {
		if(type == null) {
			return null;
		}

		if(type.equalsIgnoreCase("action")) {
			return new ActionMovieFactory();
		} else if (type.equalsIgnoreCase("comedy")) {
			return new ComedyMovieFactory();
		}
		return null;
	}
}
