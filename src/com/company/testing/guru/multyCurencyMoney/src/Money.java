package com.company.testing.multyCurencyMoney;

public class  Money implements Expression {

	private String currency;
	int amount;

	public Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}



	public static Money dollar(int amount) {
		return new Money(amount, "USD");
	}

	public static Money frank(int amount) {
		return new Money(amount, "CHF");
	}

	String currency() {
		return currency ;
	}

	public boolean equals(Object object) {
		Money money = (Money) object;
		return this.amount == money.amount
				&& this.currency == money.currency;
	}

	@Override
	public String toString() {
		return "Money{" +
				"currency='" + currency + '\'' +
				", amount=" + amount +
				'}';
	}

	@Override
	public Money reduce(Bank bank, String to) {
//		return this;
//		int rate = (currency.equalsIgnoreCase("CHF") && to.equalsIgnoreCase("USD")) ? 2 : 1;
		return new Money(amount / bank.rate(this.currency, to), to);
	}

	@Override
	public Expression times(int multiplier) {
		return new Money(amount * multiplier, this.currency);
	}

	@Override
	public Expression plus(Expression added) {
		return new Sum(this, added);
	}
}
