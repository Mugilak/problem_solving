package com.tasks.jan24;

//Input:
//N = 10, S = 15
//A[] = {1,2,3,4,5,6,7,8,9,10}
//Output: 1 5
//Explanation: The sum of elements
//from 1st position to 5th position
//is 15.

import java.util.Scanner;

public class SubarraySum {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new SubarraySum().getInput();
	}

	private void getInput() {
		System.out.println("Enter N : ");
		int n = input.nextInt();
		System.out.println("Enter array elements : ");
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}
		System.out.println("Enter k : ");
		int k = input.nextInt();
//		subArraySum(n, array, k);
		maximumSum(n, array, k);
	}

	private void maximumSum(int n, int[] array, int k) {
		if (n < k) {
			System.out.println("invalid");
			return;
		}
		int startIndex = 0, sum = 0, count = 0, max = 0;
		for (int i = 0; i < n; i++) {
			sum += array[i];
			count++;
			if (count == k) {
				if (max < sum) {
					max = sum;
				}
				sum -= array[startIndex++];
				count--;
			}
		}
		System.out.println(max);
	}
// 1, 4, 2, 10, 23, 3, 1, 0, 20
	private void subArraySum(int n, int[] array, int s) {
		int startIndex = 0, sum = 0;
		for (int i = 0; i < n; i++) {
			sum += array[i];
			while (sum > s && startIndex < n) {
				sum -= array[startIndex];
				startIndex++;
			}
			if (sum == s) {
				System.out.println((startIndex + 1) + " " + (i + 1));
				return;
			}
		}
		System.out.println("-1");
	}

}
