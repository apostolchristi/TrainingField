package com.company.oca;

public class Swan {


	public Double calculate() {
		return 4.5;
	}

	public static void main(String[] args) {

	}


}



class TestClass implements I1, I2{
	public void m1() { System.out.println("Hello"); }
	public static void main(String[] args){
		TestClass tc = new TestClass();
		( (I1) tc).m1();
	}
}
interface I1{
	int VALUE = 1;
	void m1();
}
interface I2{
	int VALUE = 2;
	void m1();
}

