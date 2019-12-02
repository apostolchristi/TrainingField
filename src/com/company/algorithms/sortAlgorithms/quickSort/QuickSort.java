package com.company.algorithms.sortAlgorithms.quickSort;

import static com.company.algorithms.sortAlgorithms.selection.Selection.*;

/**
 * Quick Sort
 * Divide and conquer algorithm
 * Recursive algorithm
 * Uses a pivot element to partition the array into two parts
 * Elements < pivot to it's left, elements > pivot to ti's right
 * Pivot will then be in its correct sorted position
 * <p>
 * In-place algorithm
 * O(nlogn) - base 2. We're repeatedly partitioning the array into two halves
 * Unstable algorithm
 */
public class QuickSort {

	public static void main(String[] args) {
		int[] intsArray = {20, 35, -15, 7, 55, 1, -22};
		quickSort(intsArray, 0, intsArray.length);
		loopArray(intsArray);


	}

	public static void quickSort(int[] input, int start, int end) {

		//this is a braking condition which is going to brake the recursion and we would deal with a one element array
		if (end - start < 2) {
			return;
		}

		/**
		 * if we're dealing with one or more element than what we want to do is figure out where the pivot will belong in the sorted array
		 * or what will be the index of the pivot when the array is sorted
		 */
		int pivotIndex = partition(input, start, end); // this returns position of the element in the sorted array
		quickSort(input, start, pivotIndex);
		quickSort(input, pivotIndex + 1, end);


	}

	public static int partition(int[] input, int start, int end) {
		//This is using the first element at the pivot
		int pivot = input[start];
		int i = start;
		int j = end;

		/** We're going to do traverse from left to right and j is going to be traversing from right to left and we want to
		 * stop when i and j cross each other.
		 */

		// it means they've crossed
		while (i < j) {

			//this is a empty loop/null
			while (i < j && input[--j] >= pivot) ;
			if (i < j) {

				/**
				 * we've used j to find the first element that is less than the pivot and we wanna put all the elements
				 * that are less than the pivot to the left of the pivot and so we're going to move that element at j
				 */
				input[i] = input[j]; //
			}

			/**	NOTE: empty/null loop body.
			 *  we're moving from left to right and we're looking for a value that is greater than the pivot because
			 *  when we find a value that's greater than the pivot we wanna move it to the right of the pivot
			 */
			while (i < j && input[++i] <= pivot); //

			/**
			 * //check when we drop out of the loop whether we've dropped out because i has crossed j and if that's not
			 * the case then we've dropped out because we found an element that's grater than the pivot so we wanna move
			 * it to the position j
			 */
			if( i < j) {
				input[j] = input[i];
			}
		}

		input[j] = pivot;


		return j;
	}
}
