package com.dailytasks.nov17;

import java.util.Arrays;
import java.util.Scanner;

public class SortByOrder {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new SortByOrder().getInput();
	}

	private void getInput() {
		System.out.println("Enter n:");
		int n = input.nextInt();
		int[] array = new int[n];
		System.out.println("Enter array elements : ");
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}
		doSort(n, array);
	}

	private void doSort(int n, int[] array) {
		int min, max, index, temp;
		for (int i = 0; i < n; i++) {
			max = min = array[i];
			index = i;
			for (int j = i + 2; j < n; j = j + 2) {
				if (i % 2 == 0) { // desc
					if (max < array[j]) {
						index = j;
						max = array[j];
					}
				} else {
					if (min > array[j]) {
						index = j;
						min = array[j];
					}
				}
			}
			temp = array[i];
			array[i] = array[index];
			array[index] = temp;

		}
		System.out.println(Arrays.toString(array));
	}

}
