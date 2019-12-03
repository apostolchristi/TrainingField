package com.company.algorithms.sortAlgorithms.countingSort;

import static com.company.algorithms.sortAlgorithms.selection.Selection.*;
/**
 * Counting Sort
 * <p>
 * Makes assumptions about the data
 * Doesn't use comparisons
 * Counts the number of occurrences of each value
 * Only works with non-negative discrete values(can't work with floats, strings)
 * Values must be within a specific range
 * <p>
 * NOT an in-place algorithm
 * O(n) - can achieve this because we're making assumptions about the data we're sorting
 * If we want the sort to be stable, we have to do some extra steps
 * <p>
 * Doesn't use comparison against each other, instead it counts the number of occurrences of each value.
 * Values must be in a specific range and a range must to be resonable it can;t be huge
 * <p>
 * { 2, 5, 9, 8, 2, 8, 7, 10, 4, 3}
 * 1. Assume we have values between 1 and 10 inclusive
 * 2. We have 10 possible values, so we create a counting array of length 10
 * 3. Traverse the input array from left to right
 * 4. Use the counting array to track how many of each value are in the input array
 * 5. Using the counts in the counting array, write the values in sorted order to the input array.
 * <p>
 * Counting sort has 2 phases:
 * 1st phase: we traverse the input array and we count how many of each value we have.
 * 2nd phase: using the counting array, we write values back into the input array.
 * <p>
 * The best case to use Counting sort is when the range of values we have is around the same length of the input array.
 * So if we have an input array of 20, ideally the number of values that there are, you want to be that to be around 20
 */
public class CountingSort {

	public static void main(String[] args) {

		int[] intsArray = { 2, 5, 9, 8, 2, 8, 7, 10, 4, 3};
		countingSort(intsArray, 1, 10);
		loopArray(intsArray);



	}

	public static void countingSort(int[] input, int min, int max) {

		/** This array will keep track of the counts, and it has to be larger enough to be able to count each possible
		 value
		 */
		int[] countArray = new int[(max - min) + 1];

		/** Once we created our countArray we want to traverse our inputArray, and we gonna count how many of each value
		 we have
		 */
		for (int i = 0; i < input.length; i++) {
			// this is translating the value we wanna count into it's index in a count array
			countArray[input[i] - min]++;
		}

		/** So once we finished counting, now we want to write the values back into inputArray
		 * j is the index we are going to use to write to the inputArray and i is the index we're going to use
		 to traverse the count array
		 */
		int j = 0;
		for (int i = min ; i < max ; i++) {
			while (countArray[i - min] > 0) {
				input[j++] = i;
				countArray[i - min]--;

			}
		}

	}
}
