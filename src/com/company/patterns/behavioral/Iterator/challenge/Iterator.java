package com.company.patterns.behavioral.Iterator.challenge;

import java.util.LinkedList;
import java.util.List;

interface Iterator {

	void first();
	String next();
	boolean isDone();
	String currentItem();
}

class ArtsIterator implements Iterator {

	private int position;
	private String [] artsSubjects;

	public ArtsIterator(String[] artsSubjects) {
		this.artsSubjects = artsSubjects;
		this.position = 0;
	}

	@Override
	public void first() {
		this.position = 0;
	}

	@Override
	public String next() {
		return artsSubjects[this.position++];
	}

	@Override
	public boolean isDone() {
		if(this.position >= this.artsSubjects.length || this.artsSubjects[this.position] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public String currentItem() {
		return this.artsSubjects[this.position];
	}
}

class ScienceIterator implements Iterator {

	private int position;
	private List<String> scienceSubjects;

	public ScienceIterator(LinkedList<String> scienceList) {
		this.scienceSubjects = scienceList;
		this.position = 0;
	}

	@Override
	public void first() {
		this.position = 0;

	}

	@Override
	public String next() {
		return this.scienceSubjects.get(this.position++);
	}

	@Override
	public boolean isDone() {
		if(this.position >= this.scienceSubjects.size() || this.scienceSubjects.get(this.position) == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public String currentItem() {
		return this.scienceSubjects.get(this.position);
	}
}
