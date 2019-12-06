package com.company.algorithms.sortAlgorithms.radixSort;

import com.company.algorithms.sortAlgorithms.insertion.Insertion;
import com.company.algorithms.sortAlgorithms.selection.Selection;

import static com.company.algorithms.sortAlgorithms.selection.Selection.*;

/**
 * Radix Sort
 * Makes assumptions about the data
 * Data must have same radix and width
 * radix = is the number of unique digits or values in the case of characters.	width = the number of digits or letters
 * Because of this, data must be integers or strings
 * Sort based on each individual digit or letter position
 * Start at the rightmost position
 * Must use a stable sort algorithm at each stage
 */


public class RadixSort {

	public static void main(String[] args) {
		int[] radixArray = {4725, 4586, 1330, 8792, 1594, 5729};
		radixSort(radixArray, 10, 4);
		loopArray(radixArray);
	}

	public static void radixSort(int[] input, int radix, int width) {

		for (int i = 0; i < width; i++) {
			radixSingleSort(input, i, radix);
		}

	}


	private static void radixSingleSort(int[] input, int position, int radix) {

		// It stores how many items that we're gonna be sorting
		int numItems = input.length;
		int[] countArray = new int[radix];

		/**
		 * By the time we finish this loop, we have a conventional countArray where all we're doing is counting the
		 number of values that have a specific digit in their one's position.
		 */
		for (int value : input) {
			countArray[getDigit(position, value, radix)]++;
		}

		//Adjust the count array
		for (int j = 1; j < radix; j++) {
			countArray[j] += countArray[j - 1];
		}

		//Copied our values into a tempArray
		int[] temp = new int[numItems];
		for (int temIndex = numItems - 1; temIndex >= 0; temIndex--) {
			temp[--countArray[getDigit(position, input[temIndex], radix)]] = input[temIndex];
		}

		//Copy our values back to originalArray
		for (int tempIndex = 0; tempIndex < numItems; tempIndex++) {
			input[tempIndex] = temp[tempIndex];
		}
	}


	/**
	 * This method is going to return the digit, so it's gonna return zero to nine and then we're going to increment the
	 * count by one
	 */
	private static int getDigit(int position, int value, int radix) {

		// Math.pow takes the first parameter and raises it to the second parameter
		return value / (int) Math.pow(10, position) % radix;
	}
}
