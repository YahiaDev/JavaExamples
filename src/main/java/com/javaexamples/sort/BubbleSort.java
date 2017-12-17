package com.javaexamples.sort;

public class BubbleSort {

	public void sort(int[] numbers) {
		if (numbers == null || numbers.length == 0) {
			return;
		}
		boolean permut = true;
		int temp;
		while (permut) {
			permut = false;
			for (int index = 0; index < numbers.length - 1; index++) {
				if (numbers[index] > numbers[index + 1]) {
					temp = numbers[index];
					numbers[index] = numbers[index + 1];
					numbers[index + 1] = temp;
					permut = true;
				}
			}
		}
	}
}
