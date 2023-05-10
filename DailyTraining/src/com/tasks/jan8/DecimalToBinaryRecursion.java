package com.tasks.jan8;

import java.util.Scanner;

public class DecimalToBinaryRecursion {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new DecimalToBinaryRecursion().getInput();
	}

	private void getInput() {
		System.out.println("Enter number : ");
		int number = input.nextInt();
		findBinary(number, "");
		findBinary(number, 0, 1);
	}

	private void findBinary(int number, int binary, int i) {
		if (number == 1) {
			System.out.println(binary + number * i);
			return;
		}
		findBinary(number / 2, ((number % 2) * i) + binary, i * 10);
	}

	private void findBinary(int number, String binary) {
		if (number <= 1) {
			System.out.println(number + binary);
			return;
		}
		findBinary(number / 2, number % 2 + binary);
	}

}
