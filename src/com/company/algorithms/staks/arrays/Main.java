package com.company.algorithms.staks.arrays;

/**
 *  * Abstract data type
 *  * LIFO - last in, first out
 *  * push -adds an item as the top item on the stack
 *  * pop - removes the top item on the stack
 *  * peek - gets the top item on the stack without popping it
 *  * Ideal backing data structure: linked list
 *
 * Time Complexity
 * O(1) for push, pop and peek, when using a linked list
 * If you use an array, then push is O(n), because the array may have to be resized
 * If you know the maximum number of items that will ever be on the stack, an array can be a good choice
 * If memory is tight, an array might be a good choice
 * Linked list is ideal
 *
 * Stack - it dictates operations what we can perform on a set of data, but it doesn't tell us how the data
 should be stored. A stack says: - I don't care how the data is organised, but these are the operations you're
 allowed to do on a data.

 Some feature:
 - The last item element that you add to a stack, is always the first item that you can remove from the stack known as LIFO
 - The item at the top of the stack is the only item that we are allowed to access.

 Example:
 - If you have a stack of paper and if you want to get to the paper that's 10 pages down on the stack, you have to remove
 the nine pages that are on top of it.

 */

public class Main {

	public static void main(String[] args) {

		Employee janeJones = new Employee("Jane" ,"Jhones", 123);
		Employee johnDoe = new Employee("John","Doe", 456);
		Employee marySmith = new Employee("Mary" ,"Smith", 22);
		Employee mikeWilson = new Employee("Mike" ,"Wilson", 3245);
		Employee billEnd = new Employee("Bill" ,"End", 111);

		ArrayStack stack = new ArrayStack(10);

		stack.push(janeJones);
		stack.push(johnDoe);
		stack.push(marySmith);
		stack.push(mikeWilson);

		stack.printStack();
	}
}
