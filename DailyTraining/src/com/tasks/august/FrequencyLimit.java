package com.tasks.august;

import java.util.Arrays;

public class FrequencyLimit {

	public static void main(String[] args) {
		frequencyCount(new int[] { 2 ,3 ,2 ,3 ,5 }, 5, 3);
	}

	public static void frequencyCount(int arr[], int N, int P) {
		int count = 0;
		for (int i = 1; i <= N; i++) {
			int index = canFound(i, arr, N);
			if (index != -1) {
				count = 0;
				for (int j = i - 1; j < N; j++) {
					if (arr[j] == i) {
						count++;
						arr[j] = 0;
					}
				}
				arr[index] = arr[i - 1];
				arr[i - 1] = count;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static int canFound(int num, int[] a, int n) {
		for (int i = num - 1; i < n; i++) {
			if (a[i] == num) {
				return i;
			}
		}
		return -1;
	}
}