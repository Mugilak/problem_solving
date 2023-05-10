package com.dailytasks.nov19;

import java.util.Scanner;

public class DifferenceInString {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new DifferenceInString().getInput();
	}

	private void getInput() {
		System.out.println("Enter string : ");
		String string = input.nextLine();
		string += "*";
		System.out.println(isEqual(string.toCharArray(), getSize(string.toCharArray())) ? "EQUAL DIFFERENCE"
				: "UNEQUAL DIFFERENCE");
	}

	private boolean isEqual(char[] array, int size) {
		int times = 0, mid = size / 2, i = 0, j = size - 1;
		while (times < mid) {
			if (Math.abs(array[i] - array[i + 1]) != Math.abs(array[j] - array[j - 1])) {
				return false;
			}
			i++;
			j--;
			times++;
		}
		return true;
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
