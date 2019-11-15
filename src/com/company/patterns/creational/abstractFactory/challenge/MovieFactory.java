package com.company.patterns.creational.abstractFactory.challenge;

public interface MovieFactory {
	HollywoodMovie getHollyWoodMovie();
	BollywoodMovie getBollywoodMovie();
}

class ActionMovieFactory implements MovieFactory {

	@Override
	public HollywoodMovie getHollyWoodMovie() {
		return new HollywoodActionMovie();
	}

	@Override
	public BollywoodMovie getBollywoodMovie() {
		return new BollywoodActionMovie();
	}
}

class ComedyMovieFactory implements MovieFactory {

	@Override
	public HollywoodMovie getHollyWoodMovie() {
		return new HollywoodComedyMovie();
	}

	@Override
	public BollywoodMovie getBollywoodMovie() {
		return new BollywoodComedyMovie();
	}
}
