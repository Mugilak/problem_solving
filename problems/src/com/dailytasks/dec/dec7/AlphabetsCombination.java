package com.dailytasks.dec.dec7;

//Enter num: 22

//output : BB, V

import java.util.Scanner;

public class AlphabetsCombination {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new AlphabetsCombination().getInput();
	}

	private void getInput() {
		System.out.println("Enter num:");
		String num = input.nextLine();
		findSubSequences(num.toCharArray(), 0, "");
	}

	private void findSubSequences(char[] array, int index, String ans) {
		int n = array.length;
		if (index == n) {
			System.out.println(ans);
			return;
		}
		int val = 0;
		for (int i = index; i <= ((n - 1) < (index + 1) ? (n - 1) : (index + 1)); i++) {
			val = (val * 10) + (int) (array[i] - '0');
			if (val > 0 && val <= 26) {
				findSubSequences(array, i + 1, ans + (char) (val + 64));
			}
		}
	}

}
