package com.company.patterns.creational.abstractFactory.challenge;

public interface HollywoodMovie {

	void getMovie();
}

class HollywoodComedyMovie implements HollywoodMovie {

	@Override
	public void getMovie() {
		System.out.println("Inside HollywoodComedyMovie::getMovie() method.");

	}
}

class HollywoodActionMovie implements HollywoodMovie {

	@Override
	public void getMovie() {
		System.out.println("Inside HollywoodActionMovie::getMovie() method.");

	}
}
