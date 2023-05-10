package com.dailytasks.nov18;

import java.util.Scanner;

public class MatrixRotation {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new MatrixRotation().getInput();
	}

	private void getInput() {
		int n;
		System.out.println("Enter size : ");
		n = input.nextInt();
		System.out.println("Enter elements : ");
		int array[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				array[i][j] = input.nextInt();
			}
		}
		System.out.println("Enter times :");
		int k = input.nextInt();
		rotateColumns(array, n, k);
	}

	private void rotateColumns(int[][] array, int n, int k) {
		int temp, val = k;
		for (int i = 0; i < n; i++) {
			while (val > 0) {
				for (int j = 0; j < n - 1; j++) {
					temp = array[i][j];
					array[i][j] = array[i][j + 1];
					array[i][j + 1] = temp;
				}
				val--;
			}
			val = k;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}

}
