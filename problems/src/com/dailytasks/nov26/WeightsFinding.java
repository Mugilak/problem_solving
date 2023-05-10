package com.dailytasks.nov26;

import java.util.Scanner;

public class WeightsFinding {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new WeightsFinding().getInput();
	}

	private void getInput() {
		System.out.println("Enter n : ");
		int n = input.nextInt();
		System.out.println("Enter set of numbers : ");
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}
		findWeights(n, array);
	}

	private void findWeights(int n, int[] array) {
		int[] weights = new int[n];
		for (int i = 0; i < n; i++) {
			if (array[i] % 2 == 0) {
				weights[i] += 3;
			}
			if (array[i] % 4 == 0 && array[i] % 6 == 0) {
				weights[i] += 4;
			}
			for (int j = 1; j <= array[i] / 2; j++) {
				if (array[i] % j == 0 && array[i] / j == j) {
					weights[i] += 5;
					break;
				}
			}
		}
		sortBasedOnWeights(array, n, weights);
	}

	private void sortBasedOnWeights(int[] array, int n, int[] weights) {
		int min = 0;
		for (int i = 0; i < n; i++) {
			min = i;
			for (int j = i; j < n; j++) {
				if (weights[j] < weights[min]) {
					min = j;
				}
			}
			System.out.println("<" + array[min] + "," + weights[min] + ">");
			weights[min] = weights[i];
			array[min] = array[i];
		}
	}

}
