package com.tasks.august.code;

public class PascalTriangle {

	public static void main(String[] args) {
		new PascalTriangle().printPascalTriangle(10);
	}

	private void printPascalTriangle(int n) {
		int number;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= (n - i); j++) {
				System.out.printf("%-3s", "");
			}
			number = 1;
			for (int j = 1; j <= i; j++) {
				System.out.printf("%-3d %2s", number, " ");
				number = number * (i - j) / j;
			}
			System.out.println();
		}
	}

}
