package com.javaexamples.main;

import com.javaexamples.sort.BubbleSort;
import com.javaexamples.sort.QuickSort;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		// Fibonacci fb = new Fibonacci();
		// System.out.println(fb.fibonacci(10));

		//QuickSort sorter = new QuickSort();
		BubbleSort sorter = new BubbleSort();
		int[] input = { 24, 2, 45, 20, 56, 75, 2, 56, 99, 53, 12 };
		sorter.sort(input);
		for (int i : input) {
			System.out.print(i);
			System.out.print(" ");
		}
	}
}
