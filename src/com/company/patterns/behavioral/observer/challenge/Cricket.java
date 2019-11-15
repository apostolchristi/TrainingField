package com.company.patterns.behavioral.observer.challenge;

import java.util.ArrayList;
import java.util.List;

//Subject
interface Cricket {

	void registerViewers(Viewers object);
	void unRegisterViewers(Viewers object);
	void notifyViewers();
}

class CricketData implements Cricket {

	private int runs;
	private int wickets;
	private float overs;
	private List<Viewers> viewersList;

	public CricketData() {
		this.viewersList = new ArrayList<>();
	}

	@Override
	public void registerViewers(Viewers object) {
		if(object == null)
			throw new NullPointerException("Null Viewer at register() method");
		if(!this.viewersList.contains(object))
			this.viewersList.add(object);
	}

	@Override
	public void unRegisterViewers(Viewers object) {
		this.viewersList.remove(object);
	}

	@Override
	public void notifyViewers() {
		for(Viewers viewer : this.viewersList) {
			viewer.update(runs, wickets, overs);
		}
	}

	public void dataChanged() {
		this.runs = getLatestRuns();
		this.wickets = getLatestWickets();
		this.overs = getLatestOvers();
		notifyViewers();
	}

	private int getLatestRuns() {
		return 90;
	}

	private int getLatestWickets() {
		return 2;
	}

	private float getLatestOvers() {
		return 10.2f;
	}
}

