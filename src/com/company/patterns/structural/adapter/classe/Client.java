package com.company.patterns.structural.adapter.classe;

public class Client {

	public static void main(String[] args) {

		ClassAdapter ca1 = new ClassAdapter();
		System.out.println(ca1.getInteger());

		ObjectAdapter ob1 = new ObjectAdapter(new IntegerValue());
		System.out.println(ob1.getInteger());
	}
}
