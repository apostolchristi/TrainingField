package com.company.patterns.creational.abstractFactory.challenge;

public interface BollywoodMovie {

	void getMovie();
}

class BollywoodComedyMovie implements BollywoodMovie {

	@Override
	public void getMovie() {
		System.out.println("Inside BollywoodComedyMovie::getMovie() method.");

	}
}

class BollywoodActionMovie implements BollywoodMovie {

	@Override
	public void getMovie() {
		System.out.println("Inside BollywoodActionMovie::getMovie() method.");

	}
}
