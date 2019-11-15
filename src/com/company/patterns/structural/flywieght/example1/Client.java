package com.company.patterns.structural.flywieght.example1;

import java.util.Random;

public class Client {

	public static void main(String[] args) throws Exception {

		RobotFactory myFactory = new RobotFactory();

//		RobotInterface shape = myFactory.getRobotFromFactroy("small");
		Robot shape = null;

		for(int i=0; i<2; i++) {
			shape = (Robot) myFactory.getRobotFromFactroy("King");
			shape.setColor(getRandomColor());
			shape.print();
		}



		int numOfDistinctRobots = myFactory.totalObjectCreated();
		System.out.println(numOfDistinctRobots);

	}

	public static String getRandomColor() {
		String color = null;
		Random r = new Random();
		int random = r.nextInt(20);
		if(random % 2 == 0) {
			return "red";
		} else {
			return "green";
		}
	}
}
