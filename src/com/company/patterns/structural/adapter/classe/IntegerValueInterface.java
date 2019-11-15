package com.company.patterns.structural.adapter.classe;

 interface IntegerValueInterface {

	int getInteger();

}

class IntegerValue implements IntegerValueInterface {

	@Override
	public int getInteger() {
		return 5;
	}
}

class ClassAdapter extends  IntegerValue {

	@Override
	public int getInteger() {
		return 2 + super.getInteger();
	}
}

class ObjectAdapter {
 	IntegerValueInterface myInt;

	public ObjectAdapter(IntegerValueInterface myInt) {
		this.myInt = myInt;
	}

	public int getInteger() {
		return 2 + this.myInt.getInteger();
	}
}
