package com.numbers.dec13;

import java.util.Scanner;

public class BeautifulNumber {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new BeautifulNumber().getInput();
	}

	private void getInput() {
		System.out.println("Enter Number : ");
		int number = input.nextInt();
		System.out.println("Enter digit to find beautiful number");
		int digit = input.nextInt();
		System.out.println((isBeautifulNumber(number, digit)) ? number + " is a Beautiful number"
				: number + " is not a Beautiful number");
	}

	private boolean isBeautifulNumber(int number, int digit) {
		int eachDigit = 0, repeatCount = 0;
		while (number > 0) {
			eachDigit = number % 10;
			if (eachDigit == digit) {
				repeatCount++;
			}
			if (repeatCount > digit) {
				return false;
			}
			number /= 10;
		}
		if (repeatCount == digit)
			return true;
		return false;
	}

}
