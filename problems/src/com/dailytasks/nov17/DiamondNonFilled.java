package com.dailytasks.nov17;

import java.util.Scanner;

public class DiamondNonFilled {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new DiamondNonFilled().getInput();
	}

	private void getInput() {
		System.out.println("Enter String:");
		String string = input.nextLine();
		if (string.length() % 2 == 1)
			printPattern(string);
		else
			System.out.println("NOT POSSIBLE");
	}

	private void printPattern(String string) {
		int length = string.length(), mid = length / 2, f = mid, b = mid;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				if (i == 0 || i == length - 1) {
					if (j == mid) {
						System.out.print(string.charAt(mid));
						f--;
					} else
						System.out.print(" ");
				} else {
					if (i <= mid) {
						if (j == f) {
							System.out.print(string.charAt(f));
							b++;
						} else if (j == b) {
							System.out.print(string.charAt(b));
							f--;
						} else
							System.out.print(" ");
						f = (f < 0) ? 1 : f;
					} else {
						if (j == f) {
							System.out.print(string.charAt(f));
							b--;
						} else if (j == b) {
							System.out.print(string.charAt(b));
							f++;
						} else
							System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}

}
