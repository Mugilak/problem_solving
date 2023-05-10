package com.training.dec13;

import java.util.Scanner;

public class XPattern {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new XPattern().getInput();
	}

	private void getInput() {
		System.out.println("Enter Number of X's : ");
		int n = input.nextInt();
		char[][] array = new char[9][(6 * n) - (n - 1)];
		printPattern(array, n);
	}

	private void printPattern(char[][] array, int n) {
		int row = 5, column = (8 * n) - (n - 1), times = 1, k, l;
		column = 5 * n;
		for (int i = 0; i < row; i++) {
			times = 1;
			int tempI = i;
			k = 0;
			l = 0;
			for (int j = 0; j < column; j++) {
				if ((i == 0 || i == 4)) {
					System.out.print("* ");
				} else if (tempI == j) {
					System.out.print("* ");
				} else if (tempI + j == 4 + k) {
					System.out.print("* ");
				}
//				else if (j == l){
//					System.out.print("* ");
//				} else if (j == 4 +l) {
//					System.out.print("* ");
//				} 
				else {
					System.out.print("  ");
				}
				if (j == (5 * times) - 1) {
					tempI += 5;
					k = 10 * times;
					times++;
					l+=5;
				}
			}
			System.out.println();
		}
	}

}
