package com.company.patterns.structural.flywieght.example1;


import java.util.HashMap;
import java.util.Map;

//FlyweightFactory
 class RobotFactory {

 	Map<String, RobotInterface> shapes = new HashMap<>();

 	public int totalObjectCreated() {
 		return shapes.size();
	}

	public RobotInterface getRobotFromFactroy(String robotType) throws Exception {
 		RobotInterface robot = null;

 		if(shapes.containsKey(robotType)) {
 			robot = shapes.get(robotType);
		} else {
 			switch (robotType) {
				case "King":
					System.out.println("We do not have a King Robot. So we are creating a King Robot");
					robot = new Robot("King");
					shapes.put("King", robot);
					break;
				case "Queen":
					System.out.println("We do not have a Queen Robot. So we are creating a Queen Robot");
					robot = new Robot("Queen");
					shapes.put("Queen", robot);
					break;
				default:
					throw new Exception(" Robot Factory can create only King and Queen Robots");
			}
		}
		return robot;
	}
}
