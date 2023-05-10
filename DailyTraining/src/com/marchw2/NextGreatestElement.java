package com.marchw2;

public class NextGreatestElement {

	public static void main(String[] args) {
		new NextGreatestElement().getInput();
	}

	private void getInput() {
		int[] array = { 4,6,5,4 };
		findNextGreatest(array);
		printArray(array);
	}

	private void printArray(int[] array) {
		for(int value : array) {
			System.out.printf("%3d",value);
		}
	}

	private void findNextGreatest(int[] array) {
		int min;
		for (int i = 0; i < array.length - 1; i++) {
			min = Integer.MAX_VALUE;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] > array[i] && min > array[j]) {
					min = array[j];
				}
			}
			if (min == Integer.MAX_VALUE) {
				array[i] = -1;
			} else
				array[i] = min;
		}
		array[array.length - 1] = -1;
	}

}
