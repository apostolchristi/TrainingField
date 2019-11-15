package com.company.patterns.creational.abstractFactory.challenge;

public class Client {

	public static void main(String[] args) {

		AbstractMovieFactory hollywoodFactoryMovie = FactoryMovieProducer.getFactoryMovie("hollywood");
		HollywoodMovie actionMovie = hollywoodFactoryMovie.getFactoryHollywoodMovie("action");
		actionMovie.getMovie();

		AbstractMovieFactory bollywoodFactoryMovie = FactoryMovieProducer.getFactoryMovie("bollywood");
		BollywoodMovie comedy = bollywoodFactoryMovie.getFactoryBollywoodMovie("comedy");
		comedy.getMovie();

		MovieFactory action = MovieProducer.getMovieFactory("action");
		HollywoodMovie hollyWoodMovie = action.getHollyWoodMovie();
		BollywoodMovie bollywoodMovie = action.getBollywoodMovie();
		hollyWoodMovie.getMovie();
		bollywoodMovie.getMovie();

		MovieFactory action1 = MovieProducer.getMovieFactory("comedy");
		HollywoodMovie hollyWoodMovie1 = action.getHollyWoodMovie();
		BollywoodMovie bollywoodMovie1 = action.getBollywoodMovie();
		hollyWoodMovie1.getMovie();
		bollywoodMovie1.getMovie();
	}
}
