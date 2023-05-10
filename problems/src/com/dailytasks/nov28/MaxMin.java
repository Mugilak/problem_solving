package com.dailytasks.nov28;

public class MaxMin {

	public static void main(String[] args) {
		new MaxMin().getInput();
	}

	private void getInput() {
		int[] array = { 0, 3,3, 5, 1, 4, 2 };
		sort(array, array.length);
	}

	private void sort(int[] array, int length) {
		int max = 0, min = Integer.MAX_VALUE, temp;
		for (int i = 0; i < length; i++) {
			max = i;
			min = i;
			for (int j = i + 1; j < length; j++) {
				if (i % 2 == 0) {
					if (array[max] < array[j]) {
						max = j;
					}
				} else {
					if (array[j] < array[min]) {
						min = j;
					}
				}
			}
			if (i % 2 == 0) {
				temp = array[i];
				array[i] = array[max];
				array[max] = temp;
			} else {
				temp = array[i];
				array[i] = array[min];
				array[min] = temp;
			}
		}
		printArray(array, length);
	}

	private void printArray(int[] array, int length) {
		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
