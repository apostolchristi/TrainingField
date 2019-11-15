package com.company.ocp.advancedClassDesign.enums;

public class Main {

	public static void main(String[] args) {

		Season s = Season.SUMMER;
		System.out.println(s);
		s.ordinal();



		Season s1 = Season.valueOf("FALL");
		System.out.println(s1);



	}
}
