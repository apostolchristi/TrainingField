package com.company.patterns.creational.singleton.challenge;

public class MakeACaptain {

	private MakeACaptain() {
	}

	public static MakeACaptain getCaptainInstance() {
		return FindCaptain.captain;
	}

	private static class FindCaptain {

		private static final MakeACaptain captain = new MakeACaptain();

	}
}
