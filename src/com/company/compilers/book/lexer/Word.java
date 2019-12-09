package com.company.compilers.book.lexer;

public class Word extends Token {

	public final String lexeme;

	public Word(int tag, String lexeme) {
		super(tag);
		this.lexeme = lexeme;
	}
}
