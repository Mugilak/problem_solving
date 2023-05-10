package com.dailytasks.nov18;

import java.util.Scanner;

public class APorGp {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new APorGp().getInput();
	}

	private void getInput() {
		System.out.println("Enter size : ");
		int n = input.nextInt();
		int[] array = new int[n];
		System.out.println("Enter array elements : ");
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}
		findNextNumber(n, array);
	}

	private void findNextNumber(int n, int[] array) {
		if (array[1] - array[0] == (array[2] - array[1])) {
			System.out.println(array[n - 1] + (array[2] - array[1]));
		} else if (array[1] / array[0] == (array[2] / array[1]))
			System.out.println(array[n - 1] * (array[2] / array[1]));
	}
}
