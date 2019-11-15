package com.company.patterns.behavioral.chainOfResponsibility.example1;

//Handler
interface DispenseChain {

	void setNextChain(DispenseChain nextChain);
	void dispense(Currency currency);
}

//ConcreteHandler1
class Dollar50Dispenser implements DispenseChain {
	private DispenseChain chain;

	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain = nextChain;
	}

	@Override
	public void dispense(Currency currency) {
		if(currency.getAmount() >= 50) {
			int num = currency.getAmount() / 50;
			int remainder = currency.getAmount() % 50;
			System.out.println("Dispensing " + num + " 50$ note");

			if(remainder != 0) {
				this.chain.dispense(new Currency(remainder));
			}
		} else {
			this.chain.dispense(currency);
		}
	}
}

//ConcreteHandler2
class Dollar20Dispenser implements DispenseChain {
	private DispenseChain chain;

	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain = nextChain;
	}

	@Override
	public void dispense(Currency currency) {
		if(currency.getAmount() >= 20) {
			int num = currency.getAmount() / 20;
			int reminder = currency.getAmount() % 20;
			System.out.println("Dispensing " + num + " 20$ note");

			if(reminder != 0 ) {
				this.chain.dispense(new Currency(reminder));
			}
		} else {
			this.chain.dispense(currency);
		}

	}
}

//ConcreteHandler3
class Dollar10Dispenser implements DispenseChain {
	private DispenseChain chain;

	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain = nextChain;
	}

	@Override
	public void dispense(Currency currency) {
		int currencyAmount = currency.getAmount();
		if(currencyAmount >= 10) {
			int num = currencyAmount / 10;
			int reminder= currencyAmount % 10;
			System.out.println("Dispensing " + num + " 10$ note");

			if(reminder != 0) {
				this.chain.dispense(new Currency(reminder));
			}
		} else {
			this.chain.dispense(currency);
		}
	}
}

