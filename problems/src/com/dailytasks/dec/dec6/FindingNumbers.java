package com.dailytasks.dec.dec6;

public class FindingNumbers {

	public static void main(String[] args) {
		new FindingNumbers().getInput();
	}

	private void getInput() {
		String s = "thtoneworee";
//		String s = "eerrhezenintoeerrhezenintothtoneworeethtoneworeethtoneworee";
		int[] visit = new int[26];
		for (int i = 0; i < s.length(); i++) {
			visit[s.charAt(i) - 'a']++;
		}
		System.out.println(findNumbers(visit, s, s.length()));
	}

	private String findNumbers(int[] visit, String s, int length) {
		int val = 0;
		String ans = "", value = "";
		if (visit['g' - 'a'] >= 1) {
			val = visit['g' - 'a'];
			ans = fill(val, ans, 8);
			value = "eight";
			lessContent(val, visit, value);
		}
		if (visit['u' - 'a'] >= 1) {
			val = visit['u' - 'a'];
			ans = fill(val, ans, 4);
			value = "four";
			lessContent(val, visit, value);
		}
		if (visit['w' - 'a'] >= 1) {
			val = visit['w' - 'a'];
			ans = fill(val, ans, 2);
			value = "two";
			lessContent(val, visit, value);
		}
		if (visit['x' - 'a'] >= 1) {
			val = visit['x' - 'a'];
			ans = fill(val, ans, 6);
			value = "six";
			lessContent(val, visit, value);
		}
		if (visit['z' - 'a'] >= 1) {
			val = visit['z' - 'a'];
			ans = fill(val, ans, 0);
			value = "zero";
			lessContent(val, visit, value);
		}
		if (visit['o' - 'a'] >= 1) {
			val = visit['o' - 'a'];
			ans = fill(val, ans, 1);
			value = "one";
			lessContent(val, visit, value);
		}
		if (visit['s' - 'a'] >= 1) {
			val = visit['s' - 'a'];
			ans = fill(val, ans, 7);
			value = "seven";
			lessContent(val, visit, value);
		}
		if (visit['f' - 'a'] >= 1) {
			val = visit['f' - 'a'];
			ans = fill(val, ans, 5);
			value = "five";
			lessContent(val, visit, value);
		}
		if (visit['i' - 'a'] >= 1) {
			val = visit['i' - 'a'];
			ans = fill(val, ans, 9);
			value = "nine";
			lessContent(val, visit, value);
		}
		if (visit['n' - 'a'] >= 1) {
			val = visit['n' - 'a'];
			ans = fill(val, ans, 10);
			value = "ten";
			lessContent(val, visit, value);
		}
		if (visit['r' - 'a'] >= 1) {
			val = visit['r' - 'a'];
			ans = fill(val, ans, 3);
			value = "three";
			lessContent(val, visit, value);
		}
		return ans;
	}

	private void lessContent(int val, int[] visit, String value) {
		char c;
		for (int i = 0; i < value.length(); i++) {
			c = value.charAt(i);
			visit[c - 'a'] -= val;
		}
	}

	private String fill(int val, String ans, int num) {
		for (int i = 1; i <= val; i++) {
			ans += num;
		}
		return ans;
	}

}
