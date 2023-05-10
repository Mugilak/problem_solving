package com.dailytasks.nov19;

import java.util.Scanner;

public class HalfBoxpattern {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new HalfBoxpattern().getInput();
	}

	private void getInput() {
		System.out.println("Enter n : ");
		int n = input.nextInt();
		printPattern((((n * n) - n) / 2) + n, n);
	}

	private void printPattern(int target, int n) {
		int[][] array = new int[n][n];
		int value = 1, index, rowBegin = 0, rowEnd = n - 1, colBegin = 0, colEnd = n - 1;
		while (value <= target) {
			int temp = rowBegin;
			for (index = colBegin; index <= colEnd; index++) {
				array[index][temp++] = value++;
			}
			colEnd--;
			rowBegin++;
			for (index = colEnd; index >= colBegin; index--) {
				array[index][rowEnd] = value++;
			}
			colEnd--;
			rowEnd--;
			for (index = rowEnd; index >= rowBegin; index--) {
				array[colBegin][index] = value++;
			}
			colBegin++;
			rowBegin++;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (array[i][j] == 0) {
					System.out.print("   ");
				} else
					System.out.printf("%3d",array[i][j]);
			}
			System.out.println();
		}
	}
}
