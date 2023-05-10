package com.dailytasks.dec.dec2;

import java.util.Arrays;
import java.util.Scanner;

public class StringReverse {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new StringReverse().getInput();
	}

	private void getInput() {
		System.out.println("Enter String : ");
		String sentence = input.nextLine() + " *";
//		int len = getLength(sentence.toCharArray());
		char[] array = sentence.toCharArray();
		reverse(array);
		reverseWithRecursion(array, array.length - 2, "", "");
	}

	private void reverseWithRecursion(char[] array, int index, String sentence, String word) {
		if (index < 0) {
			System.out.println(sentence + word +" - rec");
			return;
		}
			if (array[index] != ' ') {
				reverseWithRecursion(array, index - 1, sentence, array[index] + word);
			} else {
				sentence += word;
				reverseWithRecursion(array, index - 1, sentence, " ");
			}
	}
	// >

	private void reverse(String[] array) {
		int start = 0, last = array.length - 1;
		while (start < last) {
			String temp = array[start];
			array[start] = array[last];
			array[last] = temp;
			start++;
			last--;
		}
//		System.out.println(Arrays.toString(array));
	}

	private int getLength(char[] array) {
		int len = 0, i = 0;
		while (array[i] != '*') {
			if (array[i] == ' ')
				len++;
			i++;
		}
		return len;
	}

	private void reverse(char[] array) {
		int i = array.length - 2;
		String word = "", sentence = "";
		while (i >= 0) {
			if (array[i] != ' ') {
				word = array[i] + word;
			} else {
				sentence += (word);
				word = " ";
			}
			i--;
		}
		sentence += word;
		System.out.println(sentence);
	}
}
