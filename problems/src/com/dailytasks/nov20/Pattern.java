package com.dailytasks.nov20;

import java.util.Scanner;

public class Pattern {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new Pattern().getInput();
	}

	private void getInput() {
		System.out.println("Enter n:");
		int n = input.nextInt();
		printPattern(n);
	}

	private void printPattern(int n) {
		int value = 0, preValue=0;
		for (int i = 1; i <= n; i++) {
			value += i;
			for (int space = 1; space <= n - i; space++) {
				System.out.printf("%2s"," ");
			}
			for (int j = (n - i) + 1; j <= n; j++) {
				System.out.printf("%4d",value--);
			}
			preValue = value + (n-1);
			value += i;
			System.out.println();
		}preValue = value;
		for (int i = 1; i <= n; i++) {
			for (int space = 1; space < i; space++) {
				System.out.printf("%2s"," ");
			}
			for (int j = i; j <= n ; j++) {
				System.out.printf("%4d",value-- );
			}
			System.out.println();
		}
	}

}
