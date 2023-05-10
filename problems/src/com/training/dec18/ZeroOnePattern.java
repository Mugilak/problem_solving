package com.training.dec18;

import java.util.Scanner;

public class ZeroOnePattern {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new ZeroOnePattern().getInput();
	}

	private void getInput() {
		System.out.println("Enter number : ");
		int n = input.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = 0;
		}
		generate(n, array, 0);
	}

	private void generate(int n, int[] array, int index) {
		if (index == n) {
			printArray(array);
			return;
		}
		array[index] = 0;
		generate(n, array, index + 1);

		array[index] = 1;
		generate(n, array, index + 1);
	}

	private void printArray(int[] array) {
		for (int value : array) {
			System.out.print(value + " ");
		}
		System.out.println();
	}

}
