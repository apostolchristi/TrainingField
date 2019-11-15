package com.company.ocp.io;

import java.io.Console;

public class ConsoleExamples {

	public static void main(String[] args) {

		Console console = System.console();
		String userInput = console.readLine();
		console.writer().println("Some Text");
	}
}

class ConsoleSample {

}
