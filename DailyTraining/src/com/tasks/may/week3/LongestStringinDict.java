package com.tasks.may.week3;

import java.util.Arrays;

//input : dict[] = { "pintu", "geeksfor", "geeksgeeks" };
//        str = "geeksforgeeks";
//Output: geeksgeeks

public class LongestStringinDict {
	public static void main(String[] args) {
		new LongestStringinDict().getInput();
	}

	private void getInput() {
		String dict[] = { "ale", "apples", "monkey", "plea" };
		String str = "abpcplea";
//		String dict[] = { "pintu", "geeksfor", "geeksgeeks" };
//		String str = "geeksforgeeks";
		int[] sizes = new int[dict.length];
		findLongestString(dict, str.toCharArray(), sizes);
	}

	private void findLongestString(String[] dict, char[] str, int[] sizes) {
		boolean found[] = new boolean[dict.length];
		Arrays.fill(found, true);
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < dict.length; j++) {
				if (found[j]) {
					if (dict[j].charAt(0) == str[i]) {
						if (isPresent(dict[j].toCharArray(), 1, str, i + 1)) {
							found[j] = false;
							sizes[j] = dict[j].length();
						}
					}
				}
			}
		}
		int max = 0;
		for (int j = 1; j < sizes.length; j++) {
			if (sizes[max] < sizes[j]) {
				max = j;
			}
		}
		if (sizes[max] != 0) {
			System.out.println(dict[max]);
		} else {
			System.out.println("not found");
		}
	}

	private boolean isPresent(char[] word, int j, char[] str, int index) {
		for (int i = index; i < str.length; i++) {
			if (word[j] == str[i]) {
				j++;
			}
			if (j == word.length) {
				return true;
			}
		}
		return false;
	}

}
