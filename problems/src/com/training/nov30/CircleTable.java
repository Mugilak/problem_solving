package com.training.nov30;

import java.util.Scanner;

public class CircleTable {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new CircleTable().getInput();
	}

	private void getInput() {
		System.out.println("Enter N : ");
		int n = input.nextInt();
		System.out.println("Enter x : ");
		int x = input.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = i + 1;
		}
		getEliminated(n, x, array);
	}

	private void getEliminated(int n, int x, int[] array) {
		int count = 1, i = 0, temp = n;
		while (temp != x - 1) {
			if (i >= n) {
				i = 0;
			}
			if (array[i] != 0) {
				if (x == count) {
					System.out.print(array[i] + " ");
					temp--;
					array[i] = 0;
					count = 0;
				}
				count++;
			}
			i++;
		}
	}
}