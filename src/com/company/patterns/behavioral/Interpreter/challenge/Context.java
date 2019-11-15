package com.company.patterns.behavioral.Interpreter.challenge;

 class Context {

 	private String input;

	 public Context(String input) {
		 this.input = input;
	 }

	 public boolean getResult(String data) {
	 	if(this.input.contains(data)) {
	 		return true;
		} else {
	 		return false;
		}
	 }
 }
