package com.company.patterns.behavioral.Interpreter.challenge;

interface Expression {
	boolean interpret(Context context);
}

class TerminalExpression implements Expression {

	private String data;

	public TerminalExpression(String input) {
		this.data = input;
	}

	@Override
	public boolean interpret(Context context) {
		return context.getResult(this.data);
	}
}




