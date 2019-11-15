package com.company.ocp.generics_collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class QuesAndDeques {

	public static void main(String[] args) {

		Deque<Integer> arrayDeque = new ArrayDeque<>();
		arrayDeque.add(5);
		arrayDeque.add(4);
		arrayDeque.add(3);
		for (Integer integer : arrayDeque) {
			System.out.print(integer + " ");
		}

		System.out.println(arrayDeque.remove(new Integer(5)));


		arrayDeque.push(6);
		for (Integer integer : arrayDeque) {
			System.out.print(integer + " ");
		}

		System.out.println(arrayDeque.poll());
		for (Integer integer : arrayDeque) {
			System.out.print(integer + " ");
		}


	}
}
