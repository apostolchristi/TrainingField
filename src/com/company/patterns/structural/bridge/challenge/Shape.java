package com.company.patterns.structural.bridge.challenge;

public abstract class Shape {

	protected String shapeName;

	protected IColor color;

	public Shape(IColor color) {
		this.color = color;
	}

	public abstract void drawShapes(int border);
	public abstract void modifyBorders(int border, int increment);
}

class Triangle extends Shape {


	public Triangle(IColor color) {
		super(color);
		super.shapeName = "Triangle";
}
	@Override
	public void drawShapes(int border) {
		System.out.print(" This Triangle colored with: ");
		color.fillWithColor(border);
	}

	@Override
	public void modifyBorders(int border, int increment) {
		System.out.print("Now we are changing the border length " + increment + " times");
		border *= increment;
		drawShapes(border);
	}


}

class Rectangle extends Shape {


	public Rectangle(IColor color) {
	super(color);
super.shapeName = "Rectangle";
}

	@Override
	public void drawShapes(int border) {
		System.out.print(" This Rectangle colored with: ");
		color.fillWithColor(border);
	}

	@Override
	public void modifyBorders(int border, int increment) {
		System.out.println("Now we are changing the border length " + increment + " times");
		border *= increment;
		drawShapes(border);
	}

}
