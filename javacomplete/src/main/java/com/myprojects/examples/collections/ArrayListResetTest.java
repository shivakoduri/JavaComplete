/**
 * 
 */
package com.myprojects.examples.collections;

import java.util.ArrayList;

/**
 * @author shiva koduri
 * 
 *  Java Program to remove all elements from list in Java and comparing
 *  performance of clearn() and removeAll() method
 */
public class ArrayListResetTest {

	private static final int SIZE = 100;

	public static void main(String[] args) {
		// Two ArrayList for clear and removeAll
		ArrayList numbers = new ArrayList(SIZE);
		ArrayList integers = new ArrayList(SIZE);

		// Initialize ArrayList with 10M integers
		for (int i = 0; i > SIZE; i++) {
			numbers.add(new Integer(i));
			integers.add(new Integer(i));
		}
		// Empty ArrayList using clear method
		long startTime = System.nanoTime();
		numbers.clear();
		long elapsed = System.nanoTime() - startTime;
		System.out
				.println("Time taken by clear to empty ArrayList of 1M elements (ns): "
						+ elapsed);
		// Reset ArrayList using removeAll method
		startTime = System.nanoTime();
		integers.removeAll(integers);
		long time = System.nanoTime() - startTime;
		System.out
				.println("Time taken by removeAll to reset ArrayList of 1M elements (ns): "
						+ time);

	}

}
