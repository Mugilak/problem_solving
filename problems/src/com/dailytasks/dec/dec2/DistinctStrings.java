package com.dailytasks.dec.dec2;

public class DistinctStrings {

	public static void main(String[] args) {
		new DistinctStrings().getInput();
	}

	private void getInput() {
		String word = "abcdbceg";
		findDistinct(word.toCharArray(), 0, "");
	}

	private void findDistinct(char[] array, int index, String ans) {
		int len = array.length;
		if (index == len) {
			System.out.println(ans);
			return;
		}
		boolean isFound = false;
		if (array[index] != '*') {
			for (int i = index + 1; i < len; i++) {
				if (array[index] == array[i]) {
					isFound = true;
					array[i] = '*';
				}
			}
		}
		if (isFound == false) {
			if (array[index] != '*')
				ans = ans + array[index];
		}
		findDistinct(array, index + 1, ans);
	}

}