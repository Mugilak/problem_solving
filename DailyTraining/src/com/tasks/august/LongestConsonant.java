package com.tasks.august;

//input : children
//output : ldr 
//exp : largest consonants should be between 2 vowels

public class LongestConsonant {

	public static void main(String[] args) {
		new LongestConsonant().getInput();
	}

	private void getInput() {
		System.out.println(findSubsequence("childrensyda"));
	}

	private String findSubsequence(String string) {
		int vowelIndex = -1, length = string.length(), max = 0;
		String maxString = "";
		for (int i = 0; i < length; i++) {
			if (isVowel(string.charAt(i))) {
				if (vowelIndex != -1) {
					if (max < (i - vowelIndex - 1)) {
						max = i - vowelIndex - 1;
						maxString = string.substring(vowelIndex + 1, i);
					}
				}
				vowelIndex = i;
			}
		}
		return maxString + "  " + max;
	}

	private boolean isVowel(char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
				|| c == 'U') {
			return true;
		}
		return false;
	}

}
