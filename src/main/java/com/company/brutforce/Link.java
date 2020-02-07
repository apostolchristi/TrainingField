package com.company.brutforce;

/*
Длина	Комбинации
1			62
2			3 844
3			238 328
4			14 776 336
5			916 132 832
 */
import java.util.List;

public class Link {

	private int currentIndex = -1;
	private List<Character> symbols;
	private Link next;

	public Link(List<Character> symbols, Link link) {
		this.symbols = symbols;
		this.next = link;
	}

	public void next() {
		currentIndex++;
		if(currentIndex == symbols.size()) {
			currentIndex = 0;
			if(next != null) {
				next.next();
			}
		}
	}

	public void getKey(StringBuilder generateKey) {
		if(next != null) {
			next.getKey(generateKey);
		}
		if (currentIndex > -1) {
			generateKey.append(symbols.get(currentIndex));
		}
	}


}
