package com.dailytasks.nov18;

import java.util.Scanner;

public class Pythygorean {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new Pythygorean().getInput();
	}

	private void getInput() {
		System.out.println("Enter size : ");
		int n = input.nextInt();
		int[] array = new int[n];
		System.out.println("Enter array elements : ");
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}
		findValue(n, array);
	}

	private void findValue(int n, int[] array) {
		int index = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				index = isContains((array[i] * array[i]) + (array[j] * array[j]), array, n);
				if (index != -1) {
					System.out.println(array[i] + " , " + array[j] + " , " + array[index]);
					return;
				}
			}
		}
		System.out.println("NONE");
	}

	private int isContains(int target, int[] array, int n) {
		for (int i = 0; i < n; i++) {
			if ((array[i] * array[i]) == target) {
				return i;
			}
		}
		return -1;
	}
}
