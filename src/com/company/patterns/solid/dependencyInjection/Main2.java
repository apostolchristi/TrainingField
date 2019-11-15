package com.company.patterns.solid.dependencyInjection;

public class Main2 {

	public static void main(String[] args) {
		Service service = new ServiceA(); //the injector
		Clients clients = new Clients(service); //injects via the constructor
		clients.doSomething();

		clients.setMyService(service);	//setter injection
	}
}

interface Service {

	void write(String message);
}

class ServiceA implements Service {

	@Override
	public void write(String message) {

	}
}

class Clients {

	private Service myService;

	//injects via the constructor
	public Clients(Service service) {
		this.myService = service;
	}

	public void doSomething() {
		myService.write("Hello");
	}

	public void setMyService(Service myService) {
		this.myService = myService;
	}
}
