package com.tasks.may.day2;

public class StringCombinations {
	int count = 0;

	public static void main(String[] args) {
		new StringCombinations().init();
	}

	private void init() {
		String word = "abc";
		int length = word.length();
		for (int range = 1; range <= length; range++) {
			getCombinationOfRange(range, word.toCharArray(), 0, 0, "");
		}
		System.out.println("\n"+count);
	}

	private void getCombinationOfRange(int range, char[] array, int start, int index, String answer) {
		if (index == range) {
			System.out.println(answer);
			count++;
			return;
		}
		String combination = "";
		for (int i = start; i < array.length; i++) {
			combination = answer + array[i];
			getCombinationOfRange(range, array, i + 1, index + 1, combination);
		}
	}

}
