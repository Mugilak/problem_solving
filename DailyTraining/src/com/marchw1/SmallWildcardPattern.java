package com.marchw1;

import java.util.Scanner;

public class SmallWildcardPattern {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new SmallWildcardPattern().getInput();
	}

	private void getInput() {
		System.out.println("str 1 : ");
		String str = input.nextLine();
		System.out.println("str 2 : ");
		String str2 = input.nextLine();
		System.out.println(isSubstring(str, str2));
	}

	private boolean isSubstring(String str, String str2) {
		int i = 0, j = 0, len1 = str.length(), len2 = str2.length();
		while (i < len1 && j < len2) {
			if (str2.charAt(j) == '*') {
				j++;
				if (j == len2 && i < len1) {
					return true;
				}
			}
			if (str.charAt(i) == str2.charAt(j)) {
				i++;
				j++;
				if (j >= len2) {
					return true;
				}
			} else {
				i++;
			}
		}
		if (i >= len1 && j >= len2) {
			return true;
		}
		return false;
	}

}
