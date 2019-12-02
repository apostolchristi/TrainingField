package com.company.compiler.ownlang;

import com.company.compiler.parser.Lexer;
import com.company.compiler.parser.Token;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		final String input = "2 + 2";
		List<Token> tokenize = new Lexer(input).tokenize();
		for (Token token : tokenize) {
			System.out.println(token);
		}

	}
}
