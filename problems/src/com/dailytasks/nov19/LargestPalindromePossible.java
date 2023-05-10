package com.dailytasks.nov19;

import java.util.Arrays;
import java.util.Scanner;

public class LargestPalindromePossible {
	private Scanner input = new Scanner(System.in);
	private LinkedList list = new LinkedList();

	public static void main(String[] args) {
		new LargestPalindromePossible().getInput();
	}

	private void getInput() {
		System.out.println("Enter string : ");
		String string = input.nextLine();
		string += "*";
		findPossiblePalindrome("", string.toCharArray());
	}

	private void findPossiblePalindrome(String ans, char[] charArray) {
		if (getSize(charArray) == 0) {
			System.out.println(ans);
//			list.insertAtLast(new String(ans));
			return;
		}
		char ch = charArray[0];
		int len = getSize(charArray);
		findPossiblePalindrome(ans + ch, Arrays.copyOfRange(charArray, 1, len+1));
		findPossiblePalindrome(ans, Arrays.copyOfRange(charArray, 1, len+1));
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
