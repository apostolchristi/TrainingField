package com.company.patterns.structural.decorator.example1;

abstract class AbstractDecorator extends Component{

	protected Component component;

	public void setTheComponent(Component component) {
		this.component = component;
	}

	@Override
	public void doJob() {
		if(this.component != null) {
			component.doJob();
		}
	}
}

class ConcreteDecorator1 extends AbstractDecorator {

	@Override
	public void doJob() {
		super.doJob();

		//add aditional responsibilities
		System.out.println("I am explicity from Ex_1");
	}

}

class ConcreteDecorator2 extends AbstractDecorator {

	@Override
	public void doJob() {
		System.out.println("");
		System.out.println("*****Start Ex-2*****");
		super.doJob();

		//add aditional responsibilities
		System.out.println("I am explicity from Ex_2");
	}

}


