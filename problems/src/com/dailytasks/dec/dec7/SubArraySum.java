package com.dailytasks.dec.dec7;

import java.util.Scanner;

public class SubArraySum {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new SubArraySum().getInput();
	}

	private void getInputs() {
		System.out.println("Enter grade : ");
		char option = input.nextLine().charAt(0);
		System.out.println("You have choosen : " + getOutput(option));
	}

	private String getOutput(char option) {
		switch (option) {
		case 'E':
			return "Excellent";
		case 'V':
			return "Very Good";
		case 'G':
			return "Good";
		case 'A':
			return "Average";
		case 'F':
			return "Fail";
		default:
			return "invalid input";
		}
	}

	private void getInput() {
		System.out.println("Enter size : ");
		int size = input.nextInt();
		System.out.println("Enter array elements : ");
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = input.nextInt();
		}
		System.out.println("Enter Sum value: ");
		int sum = input.nextInt();
//		findSubArrayofSum(size, array, sum);

//		boolean ans = subArraySumWithRecursion(size, array, size, sum);
//		System.out.println(ans ? "Yes" : "No");

		findSubArray(size, array, sum);
	}

	private void findSubArray(int size, int[] array, int val) { // sliding Window
		int sum = 0, j = 0, i = size - 1;
		boolean isFound = false;
		while (i >= 0) {
			sum = 0;
			for (j = i; j >= 0 && sum < val; j--) {
				sum += array[j];
			}
			if (sum == val) {
				isFound = true;
				System.out.println("start : " + (j + 1) + " end : " + i);
				break;
			}
			sum -= array[i];
			i--;
		}
		if (!(isFound)) {
			System.out.println("-1");
		}
	}

	private boolean subArraySumWithRecursion(int n, int[] array, int j, int sum) {
		if (sum == 0) {
			System.out.println("Starts at : " + n + " end at : " + (j + 1));
			return true;
		}
		if (n == 0) {
			return false;
		}
		if (array[n - 1] > sum) {
			return subArraySumWithRecursion(n - 1, array, j - 1, sum);
		}
		return subArraySumWithRecursion(n - 1, array, j - 1, sum)
				|| subArraySumWithRecursion(n - 1, array, j, sum - array[n - 1]);
	}

	private void findArrayofSum(int size, int[] array, int k) {
		int sum = 0, i = 0, j = 0, count = 0;
		boolean isFound = false;
		while (i < size) {
			if (count == 0)
				j = i;
			if ((sum + array[i]) < k || (sum + array[i]) > k) {
//				array[i] = sum + array[i];
				sum += array[i];
				count++;
			} else if ((sum + array[i]) == k) {
				isFound = true;
				break;
			}
//			else if ((sum + array[i]) > k) {
//				count = 0;
//				sum = 0;
//				i = j;
//			}
			if (i == size - 1) {
				count = 0;
				sum = 0;
				i = j;
			}
			i++;
		}
		System.out.println((isFound) ? "start : " + j + ", end : " + i : -1);
	}

}
