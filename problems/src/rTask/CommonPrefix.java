package rTask;

import java.util.Scanner;

public class CommonPrefix {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new CommonPrefix().getInput();
	}

	private void getInput() {
		System.out.println("Enter n : ");
		String n = input.nextLine();
		int min = Integer.MAX_VALUE, index = 0;
		String[] array = new String[Integer.valueOf(n)];
		for (int i = 0; i < Integer.valueOf(n); i++) {
			array[i] = input.nextLine();
		}
		for (int i = 0; i < Integer.valueOf(n); i++) {
			if (min > array[i].length()) {
				min = array[i].length();
				index = i;
			}
		}
		int lastIndex = findCommonPrefixes(array, index, min);
		if (lastIndex != 0) {
			char[] str = array[index].toCharArray();
			for (int i = 0; i < lastIndex; i++) {
				System.out.print(str[i]);
			}
		}
//		System.out.println(findCommonPrefix(array, index, min) + " - is the common prefix substring");
	}

	private int findCommonPrefixes(String[] array, int index, int min) {
		String str = array[index];
		str += "*";
		char[] minArray = str.toCharArray(), newArray;
		int len2, index2 = 0, len = getSize(minArray);
		for (int i = 0; i < len; i++) {
			char value = minArray[i];
			for (String string : array) {
				string += "*";
				newArray = string.toCharArray();
				len2 = getSize(newArray);
				if (index2 == len2 && newArray[index2] != value) {
					return i;
				}
			}
			index2++;
		}
		return len;
	}

	private int getSize(char[] array) {
		int len = 0, i = 0;
		while (array[i] != '*') {
			len++;
			i++;
		}
		return len;
	}

	private String findCommonPrefix(String[] array, int index, int len) {
		String str = array[index], subStr = "";
		for (int i = 0; i < len; i++) {
			subStr = str.substring(0, i + 1);
			for (String string : array) {
				if (string.equals(str) == false) {
					if ((string.substring(0, i + 1).equals(subStr)) == false) {
						return subStr.substring(0, subStr.length() - 1);
					}
				}
			}
		}
		return subStr;
	}
}
