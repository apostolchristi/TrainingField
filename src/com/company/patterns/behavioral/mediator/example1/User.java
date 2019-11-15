package com.company.patterns.behavioral.mediator.example1;

//Colleague
abstract class User {

	protected ChatMediator mediator;
	protected String name;

	public User(ChatMediator mediator, String name) {
		this.mediator = mediator;
		this.name = name;
	}

	public abstract void send(String message);
	public abstract void receive(String message);
}

class UserImpl extends User {

	public UserImpl(ChatMediator mediator, String name) {
		super(mediator, name);
	}

	@Override
	public void send(String message) {
		System.out.println(this.name + ": Sending Message = " + message);
		this.mediator.sendMessage(message, this);
	}

	@Override
	public void receive(String message) {
		System.out.println(this.name + ": Received Message: " + message);
	}
}
