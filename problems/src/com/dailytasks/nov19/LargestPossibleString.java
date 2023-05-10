package com.dailytasks.nov19;

import java.util.Scanner;

public class LargestPossibleString {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new LargestPossibleString().getInput();
	}

	private void getInput() {
		System.out.println("Enter string : ");
		String string = input.nextLine();
		string += "*";
		char[] array = string.toCharArray();
		int len = getSize(array);
		getLargest(array, len);
	}

	private int getSize(char[] array) {
		int len = 0, i = 0;
		while (array[i] != '*') {
			len++;
			i++;
		}
		return len;
	}

	private void getLargest(char[] array, int len) {
		int val1, val2, min;
		char temp;
		for (int i = 0; i < len; i++) {
			val1 = array[i];
			min = i;
			for (int j = i + 1; j < len; j++) {
				val2 = array[j];
				if (val1 < val2) {
					min = j;
					val1 = array[min];
				}
			}
			temp = array[i];
			array[i] = array[min];
			array[min] = temp;
			System.out.print(array[i]);
		}
	}

}
