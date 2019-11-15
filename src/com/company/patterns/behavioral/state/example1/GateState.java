package com.company.patterns.behavioral.state.example1;

//State

interface GateState {

	void enter();

	void pay();

	void payOk();

	void payFailed();
}

//implementation for each of this methods
class OpenGateState implements GateState {

	private Gate gate_context;

	public OpenGateState(Gate gate_context) {
		this.gate_context = gate_context;
	}

	@Override
	public void enter() {

	}

	@Override
	public void pay() {

	}

	@Override
	public void payOk() {
		System.out.println("Payment is OK, let user in");
		this.gate_context.changeState(new ClosedGateState(this.gate_context));
	}

	@Override
	public void payFailed() {

	}
}

class ClosedGateState implements GateState {

	private Gate gate_context;

	public ClosedGateState(Gate gate_context) {
		this.gate_context = gate_context;
	}

	@Override
	public void enter() {

	}

	@Override
	public void pay() {

	}

	@Override
	public void payOk() {

	}

	@Override
	public void payFailed() {

	}
}
