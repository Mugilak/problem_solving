package com.training.nov30;

import java.util.Scanner;

public class Pattern {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new Pattern().getInput();
	}

	private void getInput() {
		System.out.println("Enter n : ");
		int n = input.nextInt();
		print(n);
	}

	private void print(int n) {
		int value = 1, v = 1, t = n;
		for (int i = 0; i < n; i++) {
			t = n;
			for (int j = 0; j < n - i; j++) {
				if (j == 0) {
					System.out.print(value + " ");
					v = value;
					value++;
				} else {
					v=v+t;
					System.out.print(v + " ");
					t--;
				}
			}
			System.out.println();
		}
	}

}
