package com.dailytasks.nov29;

import java.util.Scanner;

import rTask.RangeInAverageArray;

public class RangeFinding {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new RangeFinding().getInput();
	}

	private void getInput() {
		System.out.println("Enter size : ");
		int n = input.nextInt(), sum = 0;
		int[] array = new int[n];
		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
			sum += array[i];
		}
		double mean = (double)sum / n;
		double median = (n % 2 != 0) ? array[n / 2] : (array[n / 2] + array[(n / 2) - 1]) / 2;
		findValuesInRange((mean < median) ? mean : median, (mean < median) ? median : mean, n, array);
	}

	private void findValuesInRange(double small, double great, int n, int[] array) {
		double sum = 0;
		int j;
		for (int i = 0; i < n - 1; i++) {
			j = i + 1;
			sum = array[i] + array[j];
			while (j < n) {
				sum = array[i] + array[j];
				if ((sum < great && small < sum)) {
					System.out.print("(" + array[i] + "," + array[j] + ") ");
				}
				j++;
			}
		}
	}

}
