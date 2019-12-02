package com.company.compiler.abstractsyntacttree;


public final class NumberExpression implements Expression{

	private final double value;

	public NumberExpression(double value) {
		this.value = value;
	}

	@Override
	public double eval() {
		return this.value;
	}
}
