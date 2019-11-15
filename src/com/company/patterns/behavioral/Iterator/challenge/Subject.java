package com.company.patterns.behavioral.Iterator.challenge;

import java.util.LinkedList;

public interface Subject {

	Iterator createIterator();
}

class ArtsSubject implements  Subject {

	private static final int MAX_ITEMS = 2;
	private int numberOfItems = 0;
	private String [] subjects;


	public ArtsSubject() {
		subjects = new String[MAX_ITEMS];
		addItem("Art Sbuject 1");
		addItem("Art Sbuject 2");
	}

	public void addItem(String subject) {
		if(this.numberOfItems >= MAX_ITEMS) {
			System.out.println("No more available subjects for this Profile");
		} else {
			this.subjects[this.numberOfItems] = subject;
			this.numberOfItems += 1;
		}
	}

	@Override
	public Iterator createIterator() {
		return new ArtsIterator(this.subjects);
	}
}

class ScienceSubject implements Subject {

	private LinkedList<String> scienceList;

	public ScienceSubject() {
		scienceList = new LinkedList<>();
		addItem("Science Subject 1");
		addItem("Science Subject 2");
		addItem("Science Subject 3");
	}

	public void addItem(String subject) {
		this.scienceList.add(subject);
	}

	@Override
	public Iterator createIterator() {
		return new ScienceIterator(this.scienceList);
	}
}
