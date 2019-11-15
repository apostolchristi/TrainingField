package com.company.patterns.behavioral.state.example1;

//Context
// Will delegate to GateState
interface Gate {

	void enter();

	void pay();

	void payOk();

	void payFailed();

	void changeState(GateState gateState);
}

class GateImpl implements Gate {

	private GateState gate_state;

	public GateImpl() {
		this.gate_state = new ClosedGateState(this) ;
	}

	@Override
	public void changeState(GateState gateState) {
		this.gate_state = gateState;

	}

	@Override
	public void enter() {
		gate_state.enter();
	}

	@Override
	public void pay() {
		gate_state.pay();
	}

	@Override
	public void payOk() {
		gate_state.payOk();
	}

	@Override
	public void payFailed() {
		gate_state.payFailed();
	}
}
