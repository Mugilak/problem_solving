package com.dailytasks.nov17;

import java.util.Arrays;
import java.util.Scanner;

public class SentenceReverse {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new SentenceReverse().getInput();
	}

	private void getInput() {
		System.out.println("Enter Sentence :");
		String[] array = input.nextLine().split("\\s");
		printReverse(array, array.length - 1, "");
	}

	private void printReverse(String[] array, int index, String reverse) {
		if (index < 0) {
			System.out.println(reverse.stripLeading());
			return;
		}
		String reversed = "";
		reversed = reverse+" " + array[index];
		printReverse(array, index - 1, reversed);
	}

}
