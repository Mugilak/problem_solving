package com.tasks.august;

public class BinaryAddition {

	public static void main(String[] args) {
		BinaryAddition b = new BinaryAddition();
		b.findBinaryNumbers(120);
	}

	private void findBinaryNumbers(int number) {
		int temp, binary, digit;
		while (number > 0) {
			temp = number;
			binary = 0;
			digit = 1;
			while (temp > 0) {
				if (temp % 10 == 0) {
					binary = (0 * digit) + binary;
				} else {
					binary = (1 * digit) + binary;
				}
				digit *= 10;
				temp /= 10;
			}
			System.out.print(binary + " ");
			number -= binary;
		}
	}

}
