package com.company.algorithms.sortAlgorithms.bubble;

import java.util.Arrays;

public class Bubble {

	public static void main(String[] args) {

		int[] ints = {20, 35, -15, 7, 55, 1, -22};
		int[] sortedArray = bubbleSort(ints);


		for (int i = 0; i < sortedArray.length; i++) {
			System.out.println(sortedArray[i]);

		}



	}

	private static int[] bubbleSort(int[] array) {

		for (int lastUnsortedIndex = array.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			for (int i = 0; i < lastUnsortedIndex; i++) {
				if(array[i] > array[i + 1]) {
					swap(array, i, i + 1);
				}
			}
		}
		return array;
	}

	public static void swap(int[] array, int i, int j) {

		if(i == j) {
			return;
		}

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
