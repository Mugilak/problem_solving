package com.tasks.jan24;

//3. Find the element that appears once in sorted array
//Given a sorted array arr[] of size N. Find the element that appears only once in the array. All
//other elements appear exactly twice.
//Example 1:
//Input:
//N = 11
//arr[] = {1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65}
//Output: 4
//Explanation: 4 is the only element that
//appears exactly once.

import java.util.Scanner;

public class SingleOccurence {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new SingleOccurence().getInput();
	}

	private void getInput() {
		System.out.println("Enter N : ");
		int n = input.nextInt();
			System.out.println("Enter array elements : ");
			int[] array = new int[n];
			for (int i = 0; i < n; i++) {
				array[i] = input.nextInt();
			}
			System.out.println(findSinglyOccuredElement(n, array, 0, n));
	}

	private int findSinglyOccuredElement(int n, int[] array, int start, int end) {
		if (start == end - 1) {
			return array[start];
		}
		int mid =start + (end - start) / 2;
		if (array[mid] != array[mid + 1] && array[mid] != array[mid - 1]) {
			return array[mid];
		}
		if (mid % 2 == 0) {
			if (array[mid] == array[mid + 1]) {
				return findSinglyOccuredElement(n, array, mid + 1, end);
			} else if (array[mid] == array[mid - 1]) {
				return findSinglyOccuredElement(n, array, start, mid - 1);
			}
		} else {
			if (array[mid] != array[mid + 1]) {
				return findSinglyOccuredElement(n, array, mid + 1, end);
			} else if (array[mid] != array[mid - 1]) {
				return findSinglyOccuredElement(n, array, start, mid - 1);
			}
		}
		return -1;
	}

}
