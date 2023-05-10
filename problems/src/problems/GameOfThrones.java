package problems;

import java.util.HashMap;

public class GameOfThrones {

	public static void main(String[] args) {
		System.out.println(Answer("aba"));
	}

	private static String Answer(String s) {
		if (s.length() <= 1) {
			return "YES";
		}

		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		int count = 0;

		for (Integer c : map.values()) {
			if (c % 2 == 1) {
				count += 1;
			}
		}

		if (count > 1) {
			return "NO";
		}

		return "YES";
	}

	private static boolean isPalindrome(String str) {
		String reverse = "";
		for (int i = 0; i < str.length(); i++) {
			reverse = str.charAt(i) + reverse;
		}
		boolean check = reverse.equals(str) ? true : false;
		return check;
	}

}
