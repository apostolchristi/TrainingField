package com.company.algorithms.sortAlgorithms.insertion;

import com.company.algorithms.sortAlgorithms.selection.Selection;

/**
 * It's partitions the array into sorted and unsorted partitions.
 * It grows assorted partition from left > to right, so it grows a sorted partition from the front of the array.
 * -------------So how does Insertion Sort work?-------------
 * Well, it starts out by saying that the element position zero is in the sorted partition. And because this sorted partition is of length one, by default, the element is sorted, because if you
 * have an array of length one, or a partition of length one, it's sorted, right?
 * There's only one element, so at the beginning, the elements from position one into the right or in the unsorted partition. And so we're going to set a first unsorted index field to one.
 * Now, on each iteration, we take the first element in the unsorted partition which will be the element at array of first unsorted index, and we insert it into the sorted partition. And so at the end
 * of each iteration we will have grown this sorted partition by one.
 *
 * And so what we'll do on the first iteration is we will take 35, because that's the first unsorted value. And we will insert it into the sorted partition. And at the end of the iteration, the first
 * two elements in the array will be sorted.
 *
 *------------ So how is each element inserted?--------------
 * Well, what we do is we compare the value we're inserting with the values in the sorted partition. And we traverse the sorted partition from right to left, and we look for a value that is less
 * than or equal to the one we're trying to insert because once we find the value, we can stop looking we have found the correct insertion position for the new value that we're trying to insert.
 * Because remember, when we're inserting the value we are working within the sorted partition. And so if the ele,ent at index i in the sorted partition is less than or equal to the element we're
 * trying to inset, then all of the values to the left of element i will be less than or equal to the value we're trying to inser, because all the values are in sorted order.
 * So as we look for the correct insertion position, we shift values in the sorted partition to the right.
 *
 * In-place algorithm
 * O(n2) time complexity -quadratic
 * Stable algorithm
 */
public class Insertion {

	public static void main(String[] args) {

		int[] intsArray = {20, 35, -15, 7, 55, 1, -22};

		int[] sortedArray = insertionSort(intsArray);
		Selection.loopArray(sortedArray);

	}//

	public static int[] insertionSort(int[] array) {

		for(int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
			//save the value of the element we're going to insert into new element
			int newElement = array[firstUnsortedIndex];
			// we declare i outside the loop because we need it after the loop
			int i;
			//this loop does the traversal of the sorted partition and looks for the correct position to insert new element.
			//We want to keep looking for the insertion position as long as we haven't hit the front of the array, because if we hit
			//the front of the array, it means that the element we're trying to insert is the smallest element we've seen so far and
			//the correct insertion position is zero. And we wanna keep looking as long as the element we're looking at in the sorted partition
			//is greater than the one we're trying to insert, because if the element at i minus one is greater than the element we're trying to insert,
			//then we still haven't found the correct insertion position. So the moment we hit the front of the array, or the moment we hit an element that is less than
			// or equal to the element we're trying to insert, we have found the correct insertion position.
			for(i = firstUnsortedIndex; i > 0 && array[i-1] > newElement; i-- ) { 	//i>0 = means that we haven't hit the front of the array.
				array[i] = array[i-1];
			}
			array[i] = newElement;
		}
		return array;
	}

}
