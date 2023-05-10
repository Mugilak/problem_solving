package com.marchw1;

public class StringReverse {

	public static void main(String[] args) {
		System.out.println(new StringReverse().reverseWords("i.like.this.program.very.much"));
	}

	private String reverseWords(String s) {
		int n = s.length();
		String answer = "", temp = "";
		for (int i = n - 1; i >= 0; i--) {
			if (s.charAt(i) == '.') {
				answer += temp + ".";
				temp = "";
			} else {
				temp = s.charAt(i) + temp;
			}
		}
		return answer + temp;
	}

}
