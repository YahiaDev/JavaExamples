package com.javaexamples.sort;

/*
 * complexite : o(n log n)= n log(n)
 * worst case o(n2) 
 * **/

public class QuickSort {

	private int[] numbers;
	private int length;

	public void sort(int[] numbers) {
		if (numbers == null || numbers.length == 0) {
			return;
		}
		this.numbers = numbers;
		this.length = numbers.length;
		quickSort(0, this.length - 1);

	}

	private void quickSort(int lowerIndex, int higherIndex) {
		int i = lowerIndex;
		int j = higherIndex;

		int pivot = this.numbers[lowerIndex + (higherIndex - lowerIndex) / 2];

		while (i <= j) {
			while (this.numbers[i] < pivot) {
				i++;
			}

			while (numbers[j] > pivot) {
				j--;
			}

			if (i <= j) {
				exchangeNumber(i, j);
				i++;
				j--;
			}
			if (lowerIndex < j) {
				quickSort(lowerIndex, j);
			}
			if (higherIndex > i) {
				quickSort(i, higherIndex);
			}
		}

	}

	private void exchangeNumber(int i, int j) {
		int temp = this.numbers[i];
		this.numbers[i] = this.numbers[j];
		this.numbers[j] = temp;
	}

}
