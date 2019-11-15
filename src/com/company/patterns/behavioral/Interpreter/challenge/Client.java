package com.company.patterns.behavioral.Interpreter.challenge;

public class Client {

	public static Expression getMaleExpression() {
		Expression rober = new TerminalExpression("Robert");
		Expression jhon = new TerminalExpression("Jhon");

		return new OrExpression(rober, jhon);
	}

	public static Expression getMarriedWomanExpression() {
		Expression julie = new TerminalExpression("Julie");
		Expression married = new TerminalExpression("Married");
		return new AndExpression(julie, married);
	}

	public static void main(String[] args) {

		Expression isMale = getMaleExpression();
		Expression isMarried = getMarriedWomanExpression();

		Context context = new Context("Jhon");
		System.out.println("Jhon is Male? " + isMale.interpret(context));


	}
}
