package com.company.algorithms.sortAlgorithms.selection;

/**
 * This algorithm divides the array into sorted and unsorted partitions just like bubble sort does.
 * We traverse the array and we look for the largest element in the unsorted partition and when we find it,
 * we swap it with the last element in the unsorted partition, and at that point that swapped element will be its correct sorted position.
 */
public class Selection {

	public static int[] intsArray = {20, 35, -15, 7, 55, 1, -22};

	public static void main(String[] args) {

		int[] sortedArray = selectionSort(intsArray);
		loopArray(sortedArray);

	}

	private static int[] selectionSort(int[] array) {
		for (int lastUnsortedIndex = array.length-1; lastUnsortedIndex > 0 ; lastUnsortedIndex--) {
			// in an our unsorted position our largest element is 0
			int largest = 0;
			//inner loop is looking for the largest element
			for(int i=1; i<=lastUnsortedIndex; i++) {
				if(array[largest] < array[i]) {
					largest = i;
				}
			}
			// when we know the largest element we swap it
			swap(array, largest, lastUnsortedIndex );

		}
		return array;
	}

	public static void swap(int[] array, int i, int j) {

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void loopArray(int[] sortedArray) {
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.println(sortedArray[i]);
		}
	}
}
