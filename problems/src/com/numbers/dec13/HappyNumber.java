package com.numbers.dec13;

import java.util.Scanner;

public class HappyNumber {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new HappyNumber().getInput();
	}

	private void getInput() {
		System.out.println("Enter Number : ");
		int number = input.nextInt();
		System.out.println((isHappyNumber(number)) ? number + " is a Happy number" : number + " is not a Happy number");
	}

	private boolean isHappyNumber(int number) {
		int sum = number;
		while (true) {
			sum = findSum(sum);
			if (sum == 1 || sum == 7) {
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
			sum += (digit * digit);
			number /= 10;
		}
		return sum;
	}

}
