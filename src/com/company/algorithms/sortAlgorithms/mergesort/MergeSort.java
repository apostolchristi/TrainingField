package com.company.algorithms.sortAlgorithms.mergesort;

import static com.company.algorithms.sortAlgorithms.selection.Selection.*;

/**
 * Merge Sort
 * Divide and conquer algorithm
 * Recursive algorithm
 * Two phases: Splitting and Merging
 * Splitting phase leads to faster sorting during the Merging phase
 * Splitting is logical. We don't create new arrays
 *
 * So let's look at the splitting phase.
 * In the splitting phase, we start with the unsorted array, and we divide the array into two arrays, and remember, both
 * of the arrays will be unsorted, and we call the first array, the left array and second array, the right array,
 * and we generally just divide the array down the middle. If you have an odd number of elements,
 * it will depend on the implementation. Some implementation will put the extra element into the left array,
 * and some implementations will put the extra element into the right array, but the important point is you're dividing
 * the array or splitting the array into two arrays, the left array and the right array, and then once you've done that,
 * you keep splitting down event further. So now you go to the left array and you split that into a left and right array,
 * and then, you split that into a left and a right array, and then, you split that left array into a left and a right array,
 * and you keep going, splitting all the arrays and the sub-arrays until you split the original array into a bunch of
 * one-element arrays.
 *
 * Remember:
 * A one-element array is sorted by default because there's only one element in it.
 *
 * Merging process
 * We merge sibling left and right arrays
 * We create a temporary array large enough to hold all the elements in the arrays we're merging
 * We set i to the first index of the left array, and j to the first index of the right array
 * We compare left[i] to right[j]. If left is smaller we copy it to the temp array and increment i by 1. If right is smaller, we copy it to the temp array and increment j by 1.
 *
 * Merge Sort
 * NOT an in-place algorithm
 * O(nlogn) - base 2. We're repeatedly dividing the array in half during the splitting phase
 * Stable algorithm
 */

public class MergeSort {

	public static void main(String[] args) {

		int[] intsArray = {20, 35, -15, 7, 55, 1, -22};
		mergeSort(intsArray, 0, intsArray.length);
		loopArray(intsArray);

	}

	public static void mergeSort(int[] input, int start, int end){

		//this is a braking condition which is going to brake the recursion
		if(end - start < 2) {
			return;
		}

		// that is what partitions our array
		int mid = (start + end) / 2;

		//merge sort for left partition. It's the same array, only the logical partition
		mergeSort(input, start, mid);

		//merge sort for right partition
		mergeSort(input, mid, end);


		merge(input, start, mid, end);

	}

	public static void merge(int[] input, int start, int mid, int end) {


		/** Optimization 1:
		 * 	We're always merging sorted arrays, so when we call merge the left partition that we're merging is sorted and
		 *  the rigth partition is sorted, and we know that mid is the first element in the right side and it's one greater
		 * 	than the last element in the left side. "input[mid-1]" = is the last element in the left partition and "input[mid] =
		 * 	is the first element in the right partition"
		 * 	If the last element in the left partition is less or equal the first element in the right partition, that means
		 * 	all the elements in the left partition are less that or equal than the smallest element in the right partition.
		 */
		if(input[mid - 1] <= input[mid]) {
			return;
		}

		int i = start;
		int j = mid;
		int tempIndex = 0;

		//we need this to be large enough to hold the number of elements in the left and right partitions, and so, if
		//we're doing the whole array, end will be seven and start will be zero
		int[] temp = new int[end-start];

		/**
		 * When i=mid, we'll have finished traversing the left array. So as soon as we've finished traversing the left array
		 * we wanna drop out or, as soon as we finish traversing the right array, we wanna drop out.
		 */
		while (i < mid && j < end) {
			temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
		}

		/** Optimization 2:
		 * This is going to be handling the remaining elements in the array that we have in traverse.
		 * Optimization is:
		 * If we have elements remaining in the left partition we have to copy them into the temp array. But if we have
		 * elements remaining in the right partition, we don't have to do anything.
		 *
		 * input = source array
		 * i = copy at position i because that will be, if there are left over elements in the left array, this is the first index of the first element that we still haven't handled
		 * input = destination array
		 * start + tempIndex = destination index, and tempIndex has counted how many elements we've handled. And so the destination position for any elements in the left array that are gona basically
		 jump over all of the elements in the temporary array is start + tempIndex.
		 * mid - i = this tells s the number of elements that we didn't copy over into the temp array from the left partition
		 */
		System.arraycopy(input, i , input, start + tempIndex, mid - i);

		/** Copy over the temp array
		 * temp = source array
		 * 0 = start at zero cause we wanna copy from the beginning
		 * input = target array
		 * start = we start at start
		 * tempIndex = we're only going to copy the number of elements that we actually copied into the temp array. We're not gonna copy the entire temp array
		 */
		System.arraycopy(temp, 0 , input, start, tempIndex);

	}
}
