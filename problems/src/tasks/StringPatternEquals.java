package tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringPatternEquals {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new StringPatternEquals().getInput();
	}

	private void getInput() {
		String s1 = input.nextLine();
		String s2 = input.nextLine();
		System.out.println((isEqual(s1, s2)) ? "yes" : "No");
	}

	private boolean isEqual(String s1, String s2) {
		String words[] = s1.split(" ");
		int value, j = 0;
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < words.length; i++) {
			if (map.containsKey(words[i])) {
				value = map.get(words[i]);
			} else {
				value = j + 1;
				map.put(words[i], value);
				j++;
			}
			if (value != (s2.charAt(i) - 48)) {
				return false;
			}
		}
		return true;
	}

}
