package com.company.testing.multyCurencyMoney;

public interface Expression {

	Money reduce(Bank bank, String to);

	Expression plus(Expression added);

	Expression times(int multiplier);
}
