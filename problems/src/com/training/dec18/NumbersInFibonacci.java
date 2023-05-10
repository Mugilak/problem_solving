package com.training.dec18;

import java.util.Scanner;

public class NumbersInFibonacci {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new NumbersInFibonacci().getInput();
	}

	private void getInput() {
		System.out.println("Enter size : ");
		int n = input.nextInt();
		System.out.println("Enter elements : ");
		for (int i = 0; i < n; i++) {
			int value = input.nextInt();
			if (isInFibonacci(value)) {
				System.out.print(value+" ");
			}
		}
	}

	private boolean isInFibonacci(int value) {
		if (value == 0 || value == 1) {
			return true;
		}
		int num1 = 0, num2 = 1, sum = num1 + num2;
		while (sum < value) {
			num1 = num2;
			num2 = sum;
			sum = num1 + num2;
		}
		if (sum == value) {
			return true;
		}
		return false;
	}

}
