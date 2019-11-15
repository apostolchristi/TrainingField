package com.company.patterns.structural.decorator.challenge;

abstract class ShapeDecorator extends ShapeComponent {

	protected ShapeComponent shapeComponent;

	public ShapeDecorator(ShapeComponent decoratedShape) {
		this.shapeComponent = decoratedShape;
	}

	@Override
	void draw() {
		if(this.shapeComponent != null) {
			shapeComponent.draw();
		}
	}
}

class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(ShapeComponent decoratedShape) {
		super(decoratedShape);
	}

	@Override
	void draw() {
		System.out.println(shapeComponent.getClass().getName().toString() + " of red border");
		super.draw();
		setRedBorder(shapeComponent);
	}

	public void setRedBorder(ShapeComponent decoratedShape) {
		System.out.println("Border Color: Red");
	}
}

class GreenShapeDecorator extends ShapeDecorator {

	public GreenShapeDecorator(ShapeComponent decoratedShape) {
		super(decoratedShape);
	}

	@Override
	void draw() {
		System.out.println(" of red border");
		super.draw();
		System.out.println("Border Color: Green");
	}
}
