package com.dailytasks.nov17;

import java.util.Scanner;

public class SubstringFindings {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new SubstringFindings().getInput();
	}

	private void getInput() {
		System.out.println("Enter String 1 :");
		String string = input.nextLine();
		System.out.println("Enter String 2 :");
		String string2 = input.nextLine();
		System.out.println(string2.length() < string.length() ? isSubstring(string, string2) : "-1");
	}

	private int isSubString(String string, String string2) {
		int index = 0, len1 = string.length(), len2 = string2.length();
		for (int i = 0; i < len1; i++) {
			if (string.charAt(i) == string2.charAt(index)) {
				if (index == len2 - 1) {
					return (i - index);
				}
				index++;
			} else {
				i = i - index;
				index = 0;
			}
		}
		return -1;
	}

	private int isSubstring(String string, String string2) {
		int len = string2.length(), length = string.length(), index  = 0;
		for (int i = 0; i < string.length(); i++) {
			if (index  < string2.length() && string.charAt(i) == string2.charAt(index )) {
				i++;
				index ++;
				while (index  < len && i < length && string.charAt(i) == string2.charAt(index )) {
					i++;
					index ++;
				}
				if (index == len) {
					return i - index ;
				}
			}
		}
		return -1;
	}

}
