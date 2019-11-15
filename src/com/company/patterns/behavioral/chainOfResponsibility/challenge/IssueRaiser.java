package com.company.patterns.behavioral.chainOfResponsibility.challenge;

class IssueRaiser {

	private Receiver setFirstReceiver;

	public IssueRaiser(Receiver firstReceiver) {
		this.setFirstReceiver = firstReceiver;
	}

	public void raiseMessage(Message message) {
		if(this.setFirstReceiver != null) {
			this.setFirstReceiver.processMessage(message);
		}
	}
}
