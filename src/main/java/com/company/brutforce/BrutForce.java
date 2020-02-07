package com.company.brutforce;

import java.util.ArrayList;
import java.util.List;

public class BrutForce {

	public static final int MAX_KEY_SIZE = 5;

	public static void main(String[] args) {

		List<Character> symbols = generateSymbols();

		Link link = initLinks(symbols, MAX_KEY_SIZE);

		StringBuilder key = new StringBuilder();
		while ()

	}

	private static Link initLinks(List symbols, int level) {
		if (level > 0) {
			return new Link(symbols, initLinks(symbols, level-1));
		}
		return null;
	}

	private static List<Character> generateSymbols() {
		List<Character> symbols = new ArrayList<>();
		for (char c = '0'; c <= '9'; c++) symbols.add(c);
		for (char c = 'A'; c <= 'Z'; c++) symbols.add(c);
		for (char c = 'a'; c <= 'z'; c++) symbols.add(c);
		return symbols;
	}
}
