package com.tasks.jan8;

import java.util.Scanner;

public class Pattern {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new Pattern().getInput();
	}

	private void getInput() {
		System.out.println("Enter number : ");
		int number = input.nextInt();
		printPattern(number);
	}

	private void printPattern(int number) {
		int value = 1, count = number - 1, temp = 0, t = number, t2 = number;
		for (int i = 0; i < number; i++) {
			count = t2;
			temp = value;
			for (int j = 0; j <= i; j++) {
				System.out.print(value + " ");
				value = value - count;
				count++;
			}
			System.out.println();
			value = temp + t;
			t--;
			t2--;
		}
	}

}
