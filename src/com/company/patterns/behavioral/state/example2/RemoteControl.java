package com.company.patterns.behavioral.state.example2;

//State
abstract class RemoteControl {

	public abstract void pressSwitch(TV context);

}

class On extends RemoteControl {
	TV tv;

	public On(TV tv) {
		this.tv = tv;
	}

	@Override
	public void pressSwitch(TV context) {
		System.out.println("I'm already on. Going to be off Now");
		context.setState(new Off(this.tv));

	}
}

class Off extends RemoteControl {

	TV tv;

	public Off(TV tv) {

		this.tv = tv;
	}

	@Override
	public void pressSwitch(TV context) {
		System.out.println("I'm off. Going to be On now");
		context.setState(new On(this.tv));
	}
}
