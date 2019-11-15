package com.company.patterns.creational.abstractFactory.challenge;

public class FactoryMovieProducer {

	public static AbstractMovieFactory getFactoryMovie(String type) {
		if(type == null) {
			return null;
		}

		if(type.equalsIgnoreCase("hollywood")) {
			return new FactoryHollywoodMovie();
		} else if (type.equalsIgnoreCase("bollywood")) {
			return new FactoryBollywoodMovie();
		}
		return null;
	}
}
