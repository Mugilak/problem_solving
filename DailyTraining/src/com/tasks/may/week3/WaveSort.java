package com.tasks.may.week3;

//input : array[] = { 10, 5, 6, 3, 2, 20, 100, 80 }
//output: array[] = { 10, 5, 6, 2, 20, 3, 100, 80 }

public class WaveSort {

	public static void main(String[] args) {
		new WaveSort().getInput();
	}

	private void getInput() {
		int array[] = { 10, 5, 6, 3, 2, 20, 80, 140 };
		sortInWaveFormat(array);
	}

	private void sortInWaveFormat(int[] array) {
		if (array.length <= 1) {
			printArray(array);
			return;
		}
		int i = 1;
		while (i < array.length) {
			if (array[i - 1] < array[i]) {
				swap(array, i - 1, i);
			} else if (i + 1 < array.length && array[i + 1] < array[i]) {
				swap(array, i, i + 1);
				i+=2;
			} else {
				i += 2;
			}
		}
		printArray(array);
	}

	private void swap(int[] array, int index, int index2) {
		int temp = array[index];
		array[index] = array[index2];
		array[index2] = temp;
	}

	private void printArray(int[] array) {
		for (int value : array) {
			System.out.print(value + " ");
		}
	}

}
