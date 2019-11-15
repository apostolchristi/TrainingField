package com.company.patterns.behavioral.Interpreter.example1;

//AbstractExpression
// is going to represent different type of expressions that will consume the context
interface Expression {

	String interpret(InterpreterContext interpreterContext);
}

class IntToBinaryExpression implements Expression {
	private int i;

	public IntToBinaryExpression(int i) {
		this.i = i;
	}

	@Override
	public String interpret(InterpreterContext interpreterContext) {
		return interpreterContext.getBinaryFormat(i);
	}
}

class IntToHexadecimalExpression implements Expression {
	private int i;

	public IntToHexadecimalExpression(int i) {
		this.i = i;
	}

	@Override
	public String interpret(InterpreterContext interpreterContext) {
		return interpreterContext.getHexadecimalFormat(i);
	}
}
