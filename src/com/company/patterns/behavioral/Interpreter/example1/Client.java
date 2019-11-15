package com.company.patterns.behavioral.Interpreter.example1;

public class Client {
	private InterpreterContext interpreterContext;

	public Client(InterpreterContext interpreterContext) {
		this.interpreterContext = interpreterContext;
	}

	private String interpret(String str) {
		Expression expression = null;
		if (str.contains("Hexadecimal")) {
			expression = new IntToHexadecimalExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
		} else if(str.contains("Binary")) {
			expression = new IntToBinaryExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
		} else {
			return str;
		}
		return expression.interpret(this.interpreterContext);
	}


	public static void main(String[] args) {

		String str1 = "28 in Binary";
		String str2 = "28 in Hexadecimal";

		InterpreterContext interpreterContext = new InterpreterContext();
		Client client = new Client(interpreterContext);
		System.out.println(str1 + "= " + client.interpret(str1));
		System.out.println(str2 + "= " + client.interpret(str2));

	}
}
