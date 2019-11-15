package com.company.patterns.structural.bridge.challenge;

//Implementor
public abstract class IColor {

	public abstract void fillWithColor(int border);

}

class RedCircle extends IColor {

	@Override
	public void fillWithColor(int border) {
		System.out.println(" Red color with " + border + " inch border");

	}
}

class GreenCircle extends IColor {

	@Override
	public void fillWithColor(int border) {
		System.out.println(" Green color with " + border + " inch border");
	}

}
