package com.tasks.may.day2;

public class SubstringFinding {

	public static void main(String[] args) {
		new SubstringFinding().getInput();
	}

	private void getInput() {
		String word = "abc";
		findSubstrings(word.toCharArray());
	}

	private void findSubstrings(char[] array) {
		String answer = "";
		int count = 0;
		for (int i = 1; i <= array.length; i++) {
			count = 0;
			answer = "";
			for (int j = 0; j < array.length; j++) {
				count++;
				answer += array[j];
				if (count == i) {
					if (i != 1) {
						j = Math.abs(i - 1 - j);
					}
					count = 0;
					System.out.println(answer);
					answer = "";
				}
			}
		}
	}

}
