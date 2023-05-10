package com.training.dec18;

import java.util.Arrays;
import java.util.Scanner;

public class FrequentlyOccurNumbers {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new FrequentlyOccurNumbers().getInput();
	}

	private void getInput() {
		System.out.print("Enter size : ");
		int n = input.nextInt();
		int[] array = new int[n];
		System.out.println("\nEnter array elements : ");
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}
		int answer = secondFrequent(n, array);
		System.out.print("second repeated elememt : ");
		System.out.println((answer) == -1 ? array[0] : answer);
	}

	private int secondFrequent(int n, int[] array) {
		int count;
		int[] repeated = new int[n];
		for (int i = 0; i < n; i++) {
			count = 0;
			if (array[i] != Integer.MAX_VALUE) {
				for (int j = i + 1; j < n; j++) {
					if (array[i] == array[j]) {
						count++;
						array[j] = Integer.MAX_VALUE;
					}
				}
			}
			repeated[i] = count;
		}
		findTopThree(repeated, array, n);
		System.out.print("Top 3 : ");
		int times = 0;
		for (int i = 0; i < n; i++) {
			if (array[i] != Integer.MAX_VALUE) {
				System.out.print(array[i] + " ");
				times++;
				if (times == 3) {
					break;
				}
			}
		}
		System.out.println();
		return findSecond(repeated, array, n);
	}

	private int[] findTopThree(int[] repeated, int[] array, int n) {
		int max = 0, temp = 0, times = 0, prevMax = 0;
		for (int i = 0; i < n; i++) {
			max = i;
			for (int j = i + 1; j < n; j++) {
				if (repeated[max] < repeated[j]) {
					max = j;
				}
			}
			if (i > 0 && repeated[i] == repeated[prevMax]) {
				array[i] = Integer.MAX_VALUE;
				continue;
			} else {
				temp = repeated[i];
				repeated[i] = repeated[max];
				repeated[max] = temp;
				temp = array[i];
				array[i] = array[max];
				array[max] = temp;
				times++;
				prevMax = max;
				if (times == 3) {
					return array;
				}
			}
		}
		return array;
	}

	private int findSecond(int[] repeated, int[] array, int n) {
		int max = 0, temp = 0, times = 0, prevMax = 0;
		for (int i = 0; i < n; i++) {
			max = i;
			for (int j = i + 1; j < n; j++) {
				if (repeated[max] < repeated[j]) {
					max = j;
				}
			}
			if (i > 0 && repeated[i] == repeated[prevMax]) {
				continue;
			} else {
				temp = repeated[i];
				repeated[i] = repeated[max];
				repeated[max] = temp;
				temp = array[i];
				array[i] = array[max];
				array[max] = temp;
				times++;
				prevMax = max;
				if (times == 2) {
					return array[i];
				}
			}
		}
		return array[0];
	}

}
