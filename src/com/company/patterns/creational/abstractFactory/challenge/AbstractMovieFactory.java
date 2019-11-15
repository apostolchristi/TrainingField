package com.company.patterns.creational.abstractFactory.challenge;

public abstract class AbstractMovieFactory {

	protected abstract HollywoodMovie factoryHollywoodMovie(String movieType) ;
	protected abstract BollywoodMovie factoryBollywoodMovie(String movieType) ;

	public HollywoodMovie getFactoryHollywoodMovie(String movieType) {
		return factoryHollywoodMovie(movieType);
	}

	public BollywoodMovie getFactoryBollywoodMovie(String movieType) {
		return factoryBollywoodMovie(movieType);
	}
}

class FactoryHollywoodMovie extends AbstractMovieFactory {

	@Override
	protected HollywoodMovie factoryHollywoodMovie(String movieType) {
		if(movieType == null) {
			return null;
		}

		if(movieType.equalsIgnoreCase("action")){
			return new HollywoodActionMovie();
		} else if (movieType.equalsIgnoreCase("comedy")) {
			return new HollywoodComedyMovie();
		}
		return null;
	}

	@Override
	protected BollywoodMovie factoryBollywoodMovie(String movieType) {
		return null;
	}
}

class FactoryBollywoodMovie extends AbstractMovieFactory {

	@Override
	protected BollywoodMovie factoryBollywoodMovie(String movieType) {
		if(movieType == null) {
			return null;
		}

		if(movieType.equalsIgnoreCase("action")){
			return new BollywoodActionMovie();
		} else if (movieType.equalsIgnoreCase("comedy")) {
			return new BollywoodComedyMovie();
		}
		return null;
	}

	@Override
	protected HollywoodMovie factoryHollywoodMovie(String movieType) {
		return null;
	}
}
