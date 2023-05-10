package com.dailytasks.dec.dec2;

public class CloseStrings {

	public static void main(String[] args) {
		boolean ans=new CloseStrings().closeStrings("abc", "bca");
		System.out.println(ans);
	}

	public boolean closeStrings(String word1, String word2) {
		if (word1.length() != word2.length()) {
			return false;
		}
		int[] l1 = new int[26];
		int[] l2 = new int[26];
		boolean isFound = false;
		for (int i = 0; i < word1.length() || i < word2.length(); i++) {
			l1[word1.charAt(i) - 'a']++;
			l2[word2.charAt(i) - 'a']++;
		}
		for (int i = 0, j = 0; j < 26; i++, j++) {
			if (l1[i] != 0) {
				if (l2[j] == 0) {
					return false;
				}
			}
		}
		for (int i = 0; i < 26; i++) {
			isFound = false;
			if (l1[i] != 0) {
				for (int j = 0; j < 26; j++) {
					if (l2[j] != 0 && (l1[i] == l2[j])) {
						isFound = true;
						l2[j] = 0;
						break;
					}
				}
				if (!(isFound)) {
					return false;
				}
			}
		}
		return true;
	}

}
