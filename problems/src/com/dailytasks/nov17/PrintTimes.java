package com.dailytasks.nov17;

import java.util.Scanner;

public class PrintTimes {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new PrintTimes().getInput();
	}

	private void getInput() {
		System.out.println("Enter String:");
		String string = input.nextLine();
		printOutput(string, string.length());
	}

	private void printOutput(String string, int length) {
		char c = ' ';
		String num;
		for (int i = 0; i < length; i++) {
			num = "";
			if (string.charAt(i) >= 97 && string.charAt(i) <= 122) {
				c = string.charAt(i);
			}
			if (string.charAt(i) >= 48 && string.charAt(i) <= 57) {
				num += string.charAt(i);
				i++;
				while (i < length && (string.charAt(i) >= 48 && string.charAt(i) <= 57)) {
					num += string.charAt(i);
					i++;
				}
				i--;
				print(c, Integer.valueOf(num));
			}
		}
	}

	private void print(char c, Integer number) {
		for (int i = 0; i < number; i++) {
			System.out.print(c);
		}
	}

}
