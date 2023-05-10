package com.marchw1;

import java.util.Scanner;

public class AddNumbers {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new AddNumbers().getInput();
	}

	private void getInput() {
		System.out.println("Enter no. of digits :");
		int n = input.nextInt();
		int array[] = new int[n];
		System.out.println("values :");
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}
		System.out.println("Enter no. of digits :");
		int m = input.nextInt();
		int array2[] = new int[m];
		System.out.println("values :");
		for (int i = 0; i < m; i++) {
			array2[i] = input.nextInt();
		}
		add(array, n, m, array2);
	}

	private void add(int[] array, int n, int m, int[] array2) {
		int i = n - 1, j = m - 1, carry = 0, val1, val2,sum;
		String ans = "";
		while (true) {
			val1 = (i >= 0) ? array[i] : 0;
			val2 = (j >= 0) ? array2[j] : 0;
			sum=(val1 + val2 + carry);
			carry = sum / 10;
			ans = (sum% 10) + ans;
			i--;
			j--;
			if (i < 0 && j < 0) {
				System.out.println(ans);
				break;
			}
		}
	}

}
// 7 8 4 6 2 1 9 9 7

// 9 2 8 1 3 5 6 7 3 1 1 6
