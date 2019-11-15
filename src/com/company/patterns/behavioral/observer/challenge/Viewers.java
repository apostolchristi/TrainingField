package com.company.patterns.behavioral.observer.challenge;

//Observer
interface Viewers {

	void update(int runs, int wickets, float overs);
}

class AverageScore implements Viewers {

	private Cricket cricket;

	@Override
	public void update(int runs, int wickets, float overs) {
		System.out.println("Average score Display: ");
		float runRate = computeRunRate(runs, overs);
		predictedScore(runRate);
	}

	public int computeRunRate(int runs, float overs) {
		float runRate = runs / overs;
		System.out.println("Run Rate: " + runRate);
		return (int) runRate;

	}

	public void predictedScore(float runRate) {
		float predictedScore = runRate * 50;
		System.out.println("Predicted Score: " + predictedScore + "\n");
	}
}

class CurrentScore implements Viewers {

	private int runs;
	private int wickets;
	private float overs;

	@Override
	public void update(int runs, int wickets, float overs) {
		this.runs = runs;
		this.wickets = wickets;
		this.overs = overs;
		display();
	}

	public void display() {
		System.out.println("Current Score is: \n" +
				"Runs: " + this.runs + "\n" +
				"Wickets: " + this.wickets + "\n" +
				"Overs: " + this.overs + "\n");
	}
}
