package com.dailytasks.nov18;

import java.util.Scanner;

public class StringRotation {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new StringRotation().getInput();
	}

	private void getInput() {
		System.out.println("Enter string 1: ");
		String string = input.nextLine();
		string += string + "*";
		System.out.println("Enter string 2: ");
		String string2 = input.nextLine();
		string2 += "*";
		char array[] = string.toCharArray();
		char array2[] = string2.toCharArray();
		System.out.println((isRotated(array, getSize(array), array2, getSize(array2))) ? "TRUE" : "FALSE");
	}

	private int getSize(char[] array) {
		int len = 0, i = 0;
		while (array[i] != '*') {
			len++;
			i++;
		}
		return len;
	}

	private boolean isRotated(char[] array, int len1, char[] array2, int len2) {
		int index = 0;
		for (int i = 0; i < len1; i++) {
			if (array[i] == array2[index]) {
				index++;
				if (index == len2) {
					return true;
				}
			} else {
				i = i - index;
				index = 0;
			}

		}
		return false;
	}
}
