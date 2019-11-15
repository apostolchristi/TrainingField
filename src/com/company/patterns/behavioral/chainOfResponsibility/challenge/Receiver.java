package com.company.patterns.behavioral.chainOfResponsibility.challenge;

//Handler
public interface Receiver {

	boolean processMessage(Message message);
	void setNextChain(Receiver nextChain);

}

//ConcreteHandler1
class FaxErrorHandler implements Receiver {

	private Receiver nextReceiver;

	@Override
	public boolean processMessage(Message message) {
		if(message.getText().contains("Fax")) {
			System.out.println("FaxErrorHandler processed " + message.getPriority() + " priority issue" + message.getText());
			return true;
		} else {
			if(nextReceiver != null) {
				nextReceiver.processMessage(message);
			}
		}
		return false;
	}

	@Override
	public void setNextChain(Receiver nextChain) {
		this.nextReceiver = nextChain;
	}
}

//ConcreteHandler2
class EmailErrorHandler implements Receiver{

	private Receiver nextReceiver;

	@Override
	public boolean processMessage(Message message) {
		if(message.getText().contains("Email")) {
			System.out.println("FaxErrorHandler processed " + message.getPriority() + " priority issue" + message.getText());
			return true;
		} else {
			if(nextReceiver != null) {
				nextReceiver.processMessage(message);
			}
		}
		return false;
	}

	@Override
	public void setNextChain(Receiver nextChain) {
		this.nextReceiver = nextChain;

	}
}
