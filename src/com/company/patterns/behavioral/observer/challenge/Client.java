package com.company.patterns.behavioral.observer.challenge;

public class Client {

	public static void main(String[] args) {

		CricketData cricketData = new CricketData();

		Viewers averageScore = new AverageScore();
		Viewers currentScore = new CurrentScore();

		cricketData.registerViewers(averageScore);
		cricketData.registerViewers(currentScore);

		cricketData.dataChanged();
		cricketData.unRegisterViewers(averageScore);

		cricketData.dataChanged();
	}
}
