package com.company.patterns.behavioral.Interpreter.example1;

//Context
//will do the actual interpretation. It cointains information that is global to the interpreter
class InterpreterContext {

	public String getBinaryFormat(int i) {
		return Integer.toBinaryString(i);
	}

	public String getHexadecimalFormat(int i) {
		return Integer.toHexString(i);
	}
}
