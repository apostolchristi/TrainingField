package com.company.patterns.structural.facade.example1;

public class Client {

	public static void main(String[] args) {

		Amplifier amp = new Amplifier("Top-OLine Amplifier");
		Tuner tuner = new Tuner("Top-OLine AM/FM Tuner", amp);
		DvdPlayer dvd = new DvdPlayer("Top-OLine DVD Player", amp);
		CdPlayer cd = new CdPlayer("Top-OLine CD Player", amp);
		Projector projector = new Projector("Top-OLine Projector", dvd);
		TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
		Screen screen = new Screen("Theater Screen");
		PopcornPopper popper = new PopcornPopper("Popcorn Popper");

		HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, cd, dvd, popper, projector, screen,lights, tuner);
		homeTheater.watchMovie("In Time");
		homeTheater.endMovie();
	}
}
