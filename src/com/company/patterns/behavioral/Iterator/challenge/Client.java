package com.company.patterns.behavioral.Iterator.challenge;

public class Client {

	public static void main(String[] args) {

		Subject science = new ScienceSubject();
		Subject arts = new ArtsSubject();

		Iterator scienceIterator = science.createIterator();
		Iterator artIterator = arts.createIterator();

		System.out.println("\nScience subjects : ");
		helperPrint(scienceIterator);

		System.out.println("\nArts subjects : ");
		helperPrint(artIterator);
	}

	public static void helperPrint(Iterator iteratorClass) {
		while (iteratorClass.isDone()) {
			System.out.println(iteratorClass.next());
		}
	}
}
