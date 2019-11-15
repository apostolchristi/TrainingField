package com.company.ocp.concurrency;

public class Main1 implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<3; i++)
		System.out.println("Test: "+i);
	}

	public static void main(String[] args) {

		System.out.println("begin");
		(new ReadInventoryThread()).start();
		(new Thread(new Main1())).start();
		(new ReadInventoryThread()).start();
		System.out.println("end");

	}
}

class ReadInventoryThread extends Thread {

	@Override
	public void run() {
		System.out.println("Printing zoo inventory");

	}

	public static void main(String[] args) {

	factorial(10);

	}

	public static int factorial(int n) {
		if(n <= 1) {
			return 1;
		} else {
			return n * factorial(n-1);
		}
	}

}
