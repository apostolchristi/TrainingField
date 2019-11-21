package com.company.algorithms.sortAlgorithms.shell;

import static com.company.algorithms.sortAlgorithms.selection.Selection.*;
/**
 * As the algorithm progress, the gap is reduced
 * The last gap value is always 1
 * A gap value of 1 is equivalent to insertion sort
 * So th agorithm does some preliminary work(using gap values greater than 1), and then becomes insertion sort
 * By the time we get to insertion sort, the array has been partially sorted, so there's less shifting required
 *
 * In place algorithm
 * Difficult to nail down the time complexity because it will depend on the gap. Worst case: O(n2), but i can perform much better than that
 * Doesn't require as much shifting as insertion sort, so it usually performs better
 * Unstable algorithm
 */
public class Shell {


	public static void main(String[] args) {

		int[] intsArray = {20, 35, -15, 7, 55, 1, -22};
		int[] sortedArray = shellSort(intsArray);

		loopArray(sortedArray);


	}

	public static int[] shellSort(int[] array) {

		//If gap is 0, we gonna be comparing elements against themselves
		for(int gap = array.length / 2; gap > 0; gap /= 2) {
			for(int i = gap; i < array.length; i++) {
				int newElement = array[i];

				// it does traversing
				int j = i;
				//if j becomes less than the gap, that means that we've hit the front of the array
				while (j >= gap && array[j - gap] > newElement) {
					array[j] = array[j-gap];
					j = j - gap;
				}

				array[j] = newElement;
			}
		}


		return array;
	}
}
