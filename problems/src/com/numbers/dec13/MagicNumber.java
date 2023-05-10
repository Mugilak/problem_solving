package com.numbers.dec13;

import java.util.Scanner;

public class MagicNumber {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new MagicNumber().getInput();
	}

	private void getInput() {
		System.out.println("Enter Number : ");
		int number = input.nextInt();
		System.out.println((isMagicNumber(number)) ? number + " is a Magic number" : number + " is not a Magic number");
	}

	private boolean isMagicNumber(int number) {
		int sum = number;
		while (true) {
			sum = findSum(sum);
			if (sum == 1) {
				return true;
			} else if (sum > 1 && sum < 10) {
				return false;
			}
		}
	}

	private int findSum(int number) {
		int sum = 0, digit = 0;
		while (number > 0) {
			digit = number % 10;
			sum += digit;
			number /= 10;
		}
		return sum;
	}

}
