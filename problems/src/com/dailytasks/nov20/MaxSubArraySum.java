package com.dailytasks.nov20;

import java.util.Scanner;

public class MaxSubArraySum {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new MaxSubArraySum().getInput();
	}

	private void getInput() {
		System.out.println("Enter n:");
		int n = input.nextInt();
		int[] array = new int[n];
		System.out.println("Enter array elements : ");
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}
		findMaxSum(n, array);
	}

	private void findMaxSum(int n, int[] array) {
		int max = Integer.MIN_VALUE, sum = 0;
		for (int i = 0; i < n; i++) {
			sum += array[i];
			if (max < sum)
				max = sum;
			sum = sum < 0 ? 0 : sum;
		}
		System.out.println(max);
	}
}
