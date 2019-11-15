package com.company.patterns.solid.dependencyInjection;

public class Main {
}

class Client {

	//Internal reference to the service used by this client
	private ExampleService service;

	Client() {
		//specify a specific implementation in the constructor instead of using any kind of dependency injection
		service = new ExampleService();
	}

	//method withit this lcient htat uses the services
	String greet() {
		return "Hello " + service.getName();
	}
}

class ExampleService {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
