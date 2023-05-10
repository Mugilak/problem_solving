package com.tasks.apr.week4;

public class FindingPairs {

	public static void main(String[] args) {
		new FindingPairs().getInput();
	}

	private void getInput() {
		int array[] = { 3, 8, 5, 12, 14, 6 };
		int sum = 20;
		findPairs(array, sum);
	}

	private void findPairs(int[] array, int sum) {
		int index = -1;
		boolean isFound = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == Integer.MAX_VALUE) {
				continue;
			}
			index = isContainElement(array, sum - array[i]);
			if (index != -1) {
				isFound = true;
				System.out.print("(" + array[i] + "," + array[index] + ") ");
				array[i] = Integer.MAX_VALUE;
			}
		}
		if (!isFound) {
			System.out.println("No pairs of sum for " + sum);
		}
	}

	private int isContainElement(int[] array, int value) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				return i;
			}
		}
		return -1;
	}

}
