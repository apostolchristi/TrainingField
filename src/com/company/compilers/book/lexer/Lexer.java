package com.company.compilers.book.lexer;

import java.io.IOException;
import java.util.Hashtable;

public class Lexer {

	public int line = 1;
	private char peek = ' ';
	private Hashtable words = new Hashtable();

	void reserve(Word t) {
		words.put(t.lexeme, t);
	}

	// Keywords true and false have been reserved
	public Lexer() {
		reserve(new Word(Tag.TRUE, "true"));
		reserve(new Word(Tag.FALSE, "false"));
	}

	public Token scan() throws IOException {
		for (; ; this.peek = (char) System.in.read()) {
			if (this.peek == ' ' || this.peek == '\t') {
				continue;
			} else if (this.peek == '\n') {
				this.line = this.line + 1;
			} else {
				break;
			}
		}
/**
 * The code for reading a sequence of digits
 */
		//check whether peek is a digit
		if (Character.isDigit(peek)) {
			int v = 0;

			//accumulates the integer value of the sequence of digits in the input and returns a new Num object.
			do {
				v = 10 * v + Character.digit(this.peek, 10);
				this.peek = (char) System.in.read();
			} while (Character.isDigit(this.peek));
			return new Num(v);
		}

		// analyze reserved words and identifiers
		if (Character.isLetter(this.peek)) {
			StringBuffer buffer = new StringBuffer();
			do {
				buffer.append(this.peek);
				this.peek = (char) System.in.read();
			} while (Character.isLetterOrDigit(this.peek));
			String string = buffer.toString();
			Word word = (Word) this.words.get(string);
			if (word != null) {
				return word;
			}
			// is reached if string is not reserved, so it must be the lexeme for an identifier.
			word = new Word(Tag.ID, string);
			words.put(string, word);
			return word;
		}

		//  return the current character as a token and set peek to a blank that will be stripped the next time scan is called
		Token token = new Token(this.peek);
		this.peek = ' ';
		return token;
	}
}
