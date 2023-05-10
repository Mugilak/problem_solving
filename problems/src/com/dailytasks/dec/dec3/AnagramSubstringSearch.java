package com.dailytasks.dec.dec3;

import java.util.Vector;

public class AnagramSubstringSearch {

	public static void main(String[] args) {
		new AnagramSubstringSearch().getInput();
	}

	private void getInput() {
		String txt = "BACDGCFBCDABCFVEURBREABDC";
		String pat = "ABCD";
		Vector<Integer> indices = findAnagrams(txt, pat);
		System.out.print("[ ");
		for (int i : indices)
			System.out.print(i + " ");
		System.out.print("]");
	}

	static Vector<Integer> findAnagrams(String s, String p) {
		int n = s.length(), m = p.length();
		Vector<Integer> ans = new Vector<Integer>();
		if (n < m || m == 0)
			return ans;
		int[] ms = new int[26];
		int[] mp = new int[26];
		for (char c : p.toCharArray()) {
			mp[c - 'A']++;
		}

		int i = 0;
		boolean flag = true;
		for (i = 0; i < m; i++) {
			ms[s.charAt(i) - 'A']++;
		}
		for (int j = 0; j < 26; j++)
			if (mp[j] != ms[j])
				flag = false;
		if (flag)
			ans.add(0);
		for (i = m; i < n; i++) {
			ms[s.charAt(i - m) - 'A']--;
			ms[s.charAt(i) - 'A']++;
			if (mp[s.charAt(i) - 'A'] == ms[s.charAt(i) - 'A']) {
				flag = true;
				for (int j = 0; j < 26; j++)
					if (mp[j] != ms[j])
						flag = false;
			} else
				flag = false;
			if (flag)
				ans.add(i -(m-1));
		}
		return ans;
	}

}
