package com.company.compiler.parser;

import java.util.ArrayList;
import java.util.List;

public final class Lexer {

	private static final String OPERATOR_CHARS = "+-*/";
	private static final TokenType[] OPERATOR_TOKENS = {
			TokenType.PLUS, TokenType.MINUS,
			TokenType.STAR, TokenType.SLASH
	};
	private final String input;
	private final int length;
	private final List<Token> tokens;

	private int pos;

	public Lexer(String input) {
		this.input = input;
		this.length = input.length();

		this.tokens = new ArrayList<>();
	}

	public List<Token> tokenize() {
		while (this.pos < this.length) {
			final char current = peek(0);
			if (Character.isDigit(current))  {
				tokenizeNumber();
			} else if (OPERATOR_CHARS.indexOf(current) != -1) {
				tokenizeOperator();
			} else {
				// it could be whitespaces or any other unknown symbol
				next();
			}
		}
		return this.tokens;
	}

	private void tokenizeOperator() {
		final int position = OPERATOR_CHARS.indexOf(peek(0));
		addToken(OPERATOR_TOKENS[position]);
		next();
	}


	private void tokenizeNumber() {
		final StringBuilder buffer = new StringBuilder();

		char current = peek(0);
		while (Character.isDigit(current)) {
			buffer.append(current);
			current = next();

		}
		addToken(TokenType.NUMBER, buffer.toString());
	}


	private char next() {
		this.pos++;
		return peek(0);
	}


	//Check the symbols
	private char peek(int relativePosition) {
		final int position = this.pos + relativePosition;
		if (position >= this.length) {
			return '\0';
		}
		return this.input.charAt(position);
	}


	private void addToken(TokenType type) {
		addToken(type, "");
	}


	private void addToken(TokenType type, String text) {
		this.tokens.add(new Token(type, text));
	}


}
