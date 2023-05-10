package com.training.nov28;

import java.util.Scanner;

public class PresentInArray1 {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new PresentInArray1().getInput();
	}

	private void getInput() {
		System.out.println("N:");
		int n = input.nextInt();
		System.out.println("M:");
		int m = input.nextInt(), val;
		int[] A = new int[n];
		System.out.println("A[] : ");
		for (int i = 0; i < n; i++) {
			A[i] = input.nextInt();
		}
		System.out.println("B[] : ");
		for (int i = 0; i < m; i++) {
			val = input.nextInt();
			for (int j = 0; j < n; j++) {
				if (val == A[j]) {
					A[j] = Integer.MAX_VALUE;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			if (A[i] != Integer.MAX_VALUE) {
				System.out.print(A[i] + " ");
			}
		}
	}

}
