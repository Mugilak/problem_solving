package com.dailytasks.nov18;

import java.util.Scanner;

public class BalanceParanthesis {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new BalanceParanthesis().getInput();
	}

	private void getInput() {
		System.out.println("Enter string : ");
		String string = input.nextLine();
		getValid(string);
	}

	private void getValid(String string) {
		string += "*";
		char[] array = string.toCharArray();
		int len = getSize(array), count = 0;
		for (int i = 0; i < len; i++) {
			if (array[i] == '(') {
				count++;
			} else if (array[i] == ')') {
				count--;
			}
			if (count == -1) {
				array[i] = '*';
				count++;
			}
		}
		count = 0;
		for (int i = len - 1; i >= 0; i--) {
			if (array[i] == '(') {
				count++;
			} else if (array[i] == ')') {
				count--;
			}
			if (count == 1) {
				array[i] = '*';
				count--;
			}
		}
		int size = getMaxSize(array, len);
		System.out.println("\n" + size);
	}

	private int getMaxSize(char[] array, int len) {
		int count = 0;
		for (int i = 0; i < len; i++) {
			if (array[i] != '*') {
				System.out.print(array[i]);
				count++;
			}
		}
		return count;
	}

	private int getSize(char[] array) {
		int len = 0, i = 0;
		while (array[i] != '*') {
			len++;
			i++;
		}
		return len;
	}
}
