package com.company.algorithms.sortAlgorithms.recursion;
// 1 factorial = one times zero factorial
// 1! = 1 * 0! = 1

// 2 factorial = 2 times 1 which is 2 * 1 factorial
// 2! = 2 * 1 = 2 * 1!

// 3 factorial = 3 times 2 times 1 which is 3 times 2 factorial
// 3! = 3 * 2 * 1 = 3 * 2!

// 4 factorial = 4 times 3 times 2 times 1 which is 4 times 3 factorial
// 4! = 4 * 3 * 2 * 1 =  4 * 3!

// n! = n * (n-1)! - our formula to get factorial

/**
 * how it works:
 * we start out with calling recursiveFactorial num = 3 and when it hits line it 34 it calls recursiveFactorial two. So it can't return until it gets the value of recursiveFactorial two and so the call,
 * so call to recursiveFactorial(3) gets pushed onto the call stack then recursiveFactorial(2) is called it cant return until it gets the result from returnFactorial(1) and it gets pushed on the call stack
 */

public class Factorial {

	public static void main(String[] args) {

		System.out.println(recursiveFactorial(3));
		System.out.println(iterativeFactorial(3));

	}

	public static int recursiveFactorial(int num) {

		if(num == 0) {
			return 1;
		}

		return num * recursiveFactorial(num -1);
	}


	public static int iterativeFactorial(int num) {

		if (num == 0) {
			return 1;
		}

		int factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial *= i;
		}
		return factorial;
	}


}
