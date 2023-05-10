package com.training.nov30;

import java.util.Scanner;

public class BinaryAddition {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new BinaryAddition().getInput();
	}

	private void getInput() {
		System.out.println("Enter a : ");
		int a = input.nextInt();
		System.out.println("Enter b : ");
		int b = input.nextInt();
		addBase2(a, b);
		addBase4(a,b);
	}

	private void addBase4(int a, int b) {
		int carry = 0, j = 1, temp = 0, result = 0, length = a > b ? (a + "").length() : (b + "").length();
		for (int i = 0; i <= length; i++) {
			int d1 = a > 0 ? (a % 10) : 0;
			int d2 = b > 0 ? (b % 10) : 0;
			a /= 10;
			b /= 10;
			temp = d1 + d2 + carry;
			carry = temp / 4;
			result = (temp % 4) * j + (result);
			j *= 10;
		}
		System.out.println(result);
	}

	private void addBase2(int a, int b) {
		int carry = 0, j = 1, temp = 0, result = 0, length = a > b ? (a + "").length() : (b + "").length();
		for (int i = 0; i <= length; i++) {
			int d1 = a > 0 ? (a % 10) : 0;
			int d2 = b > 0 ? (b % 10) : 0;
			a /= 10;
			b /= 10;
			temp = d1 + d2 + carry;
			carry = temp / 2;
			result = (temp % 2) * j + (result);
			j *= 10;
		}
		System.out.println(result);
	}
}