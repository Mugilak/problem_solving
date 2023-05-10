package com.dailytasks.dec.dec1;

import java.util.Scanner;

//Input : hello world,1,4
//Output : holle world

public class ReverseString {
	private Scanner input = new Scanner(System.in);
	int num1, num2;
	String word;

	public static void main(String[] args) {
		new ReverseString().getInput();
	}

	private void getInput() {
		System.out.print("Input : ");
		String inp = input.nextLine() + "*";
		split(inp.toCharArray());
		word += "*";
		char[] array = word.toCharArray();
		int length = getLength(array);
		if (num1 < 0 || num2 >= length || array.length <= 0) {
			System.out.println("Invalid input");
		} else {
			if (num2 == 0) {
				reverse(array, num1, length - 1);
				printWord(array, length);
			} else {
				if (num1 < num2) {
					reverse(array, num1, num2);
					printWord(array, length);
				} else {
					System.out.println("Invalid input");
				}
			}
		}
	}

	private void printWord(char[] array, int length) {
		for (int i = 0; i < length; i++) {
			System.out.print(array[i]);
		}
	}

	private void reverse(char[] array, int start, int end) {
		while (start < end) {
			swap(array, start, end);
			start++;
			end--;
		}
	}

	private void swap(char[] array, int start, int end) {
		char temp = array[start];
		array[start] = array[end];
		array[end] = temp;
	}

	private void split(char[] array) {
		int i = 0;
		word = "";
		while (i < array.length && array[i] != ',') {
			if (array[i] != '*' && array[i] != ',') {
				if ((array[i] >= 65 && array[i] <= 90) || (array[i] >= 97 && array[i] <= 122))
					word = word + array[i];
				else if (array[i] == ' ')
					word = word + array[i];
			}
			i++;
		}
		i++;
		while (i < array.length && array[i] != ',') {
			if (array[i] >= 48 && array[i] <= 57) {
				num1 = ((int) (array[i] - '0'));
			}
			i++;
		}
		i++;
		while (i < array.length && array[i] != ',') {
			if (array[i] >= 48 && array[i] <= 57) {
				num2 = ((int) (array[i] - '0'));
			}
			i++;
		}

	}

	private int getLength(char[] array) {
		int i = 0, len = 0;
		while (array[i] != '*') {
			if (array[i] == ' ' && array[i + 1] == '*') {
				break;
			}
			len++;
			i++;
		}
		return len;
	}

}
