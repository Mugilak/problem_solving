package com.tasks.jan24;

//Input:
//N = 4
//arr[] = {1, 5, 3, 2}
//Output: 2
//Explanation: There are 2 triplets:
//1 + 2 = 3 and 3 +2 = 5
//Example 2:
//Input:
//N = 3
//arr[] = {2, 3, 4}
//Output: 0
//Explanation: No such triplet exits

import java.util.Scanner;

public class TripletsCount {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new TripletsCount().getInput();
	}

	private void getInput() {
		System.out.println("Enter Array size : ");
		int n = input.nextInt();
		System.out.println("Enter array elements : ");
		int[] array = new int[n];
		int max = 0;
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println(findTripletsCount(n, array, 0, max));
	}

	private int findTripletsCount(int n, int[] array, int tripletCount, int max) {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (isContains(array[i] + array[j], array, n)) {
					tripletCount++;
				}
			}
		}
		return tripletCount;
	}

	private boolean isContains(int value, int[] array, int n) {
		for (int i = 0; i < n; i++) {
			if (array[i] == value) {
				return true;
			}
		}
		return false;
	}

}
