package com.company.patterns.behavioral.command.example1;

//Invoker
public class FileInvoker {

	private Command command;

	public FileInvoker(Command command) {
		this.command = command;
	}

	public void execute() {
		command.execute();
	}
}
