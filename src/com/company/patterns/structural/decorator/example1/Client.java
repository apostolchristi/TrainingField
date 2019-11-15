package com.company.patterns.structural.decorator.example1;

public class Client {

	public static void main(String[] args) {

		ConcreteComponent concreteComponent = new ConcreteComponent();

		AbstractDecorator abstractDecoratorExample1 = new ConcreteDecorator1();
		abstractDecoratorExample1.setTheComponent(concreteComponent);
		abstractDecoratorExample1.doJob();

		AbstractDecorator abstractDecoratorExample2 = new ConcreteDecorator2();
		abstractDecoratorExample2.setTheComponent(concreteComponent);
		abstractDecoratorExample2.doJob();


	}
}
