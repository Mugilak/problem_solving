package com.dailytasks.nov29;

import java.util.Scanner;

public class SumInSubarray {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new SumInSubarray().getInput();
	}

	private void getInput() {
		System.out.println("Enter size : ");
		int n = input.nextInt();
		int[] array = new int[n];
		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}
		System.out.println("Enter k:");
		int k = input.nextInt();
		findSum(n, array, k);
	}

	private void findSum(int n, int[] array, int k) {
		int j = 0, sum = array[j];
		for (int i = 1; i < n;) {
			while (i<n&&(sum + array[i]) < k) {
				sum += array[i];
				i++;
			}
			
			if ((sum + array[i]) == k) {
				System.out.println("start at " + j + " end at " + i);
			}
			j++;
			if (j < n) {
				sum = array[j];
				i = j + 1;
			}
		}
	}
}
