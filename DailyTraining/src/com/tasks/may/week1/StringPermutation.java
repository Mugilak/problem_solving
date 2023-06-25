package com.tasks.may.week1;

public class StringPermutation {
	int count = 0;

	public static void main(String[] args) {
		new StringPermutation().init();
	}

	private void init() {
		char word[] = { 'h', 'e', 'l' };
		findPermutations(word, 0);
		System.out.println("\n"+count);
	}

	private void findPermutations(char[] array, int index) {
		int length = array.length;
		if (index == length) {
			printArray(array);
			return;
		}
		for (int i = index; i < length; i++) {
			swap(i, index, array);
			findPermutations(array, index + 1);
			swap(i, index, array);
		}
	}

	private void swap(int i, int index, char[] array) {
		char temp = array[i];
		array[i] = array[index];
		array[index] = temp;
	}

	private void printArray(char[] array) {
		count++;
		for (char value : array) {
			System.out.print(value + " ");
		}
		System.out.println();
	}

}
