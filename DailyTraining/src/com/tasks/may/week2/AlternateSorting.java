package com.tasks.may.week2;

//input  : { 1, 2, 3, 4, 5, 6, 7 }
//output : 7 1 6 2 5 3 4 

public class AlternateSorting {

	public static void main(String[] args) {
		new AlternateSorting().getInput();
	}

	private void getInput() {
		int array[] = { 1, 2, 3, 4, 5, 6, 7 };
		sortAlternatively(array);
	}

	private void sortAlternatively(int[] array) {
		int minIndex = 0, maxIndex = 0, temp;
		for (int i = 0; i < array.length; i++) {
			maxIndex = i;
			for (int j = i; j < array.length; j++) {
				if (array[maxIndex] < array[j]) {
					maxIndex = j;
				}
			}
			if (i != maxIndex) {
				temp = array[i];
				array[i] = array[maxIndex];
				array[maxIndex] = temp;
			}
			i++;
			if (i == array.length) {
				break;
			}
			minIndex = i;
			for (int j = i; j < array.length; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			if (i != minIndex) {
				temp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = temp;
			}
		}
		printArray(array);
	}

	private void printArray(int[] array) {
		for (int value : array) {
			System.out.print(value + " ");
		}
	}
	private void find() {
		
	}

}
