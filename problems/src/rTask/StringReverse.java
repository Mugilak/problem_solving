package rTask;

import java.util.Scanner;

public class StringReverse {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new StringReverse().getInput();
	}

	private void getInput() {
		System.out.println("Enter string : ");
		String s1 = input.nextLine();
		s1 += "`";
//		reverse(s1.toCharArray(), findLength(s1.toCharArray()));
		reverseAsString(s1.toCharArray(), findLength(s1.toCharArray()));
	}

	private void reverseAsString(char[] array, int length) {
		String reverse = "";
		int j = length - 1;
		for (int i = 0; i < length;) {
			if ((array[i] >= 97 && array[i] <= 122) || (array[i] >= 48 && array[i] <= 57)
					|| (array[i] >= 65 && array[i] <= 90)) {
				if (j >= 0 && ((array[j] >= 97 && array[j] <= 122) || (array[j] >= 48 && array[j] <= 57)
						|| (array[j] >= 65 && array[j] <= 90))) {
					reverse += array[j];
					i++;
				}
				j--;
			} else {
				reverse += array[i];
				i++;
			}
		}
		System.out.println(reverse);
	}

	private int findLength(char[] array) {
		int i = 0, len = 0;
		while (array[i] != '`') {
			len++;
			i++;
		}
		return len;
	}

	private void reverse(char[] array, int len) {
		String reverse = "";
		for (int i = len - 1; i >= 0; i--) {
			reverse += array[i];
		}
		System.out.println(reverse);
	}

}
