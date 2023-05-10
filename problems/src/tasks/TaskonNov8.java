package tasks;

//Enter string : 
//hello
//hel2o

import java.util.HashMap;
import java.util.Scanner;

public class TaskonNov8 {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new TaskonNov8().getInput();
	}

	private void getInput() {
		System.out.println("Enter string : ");
		String s = input.nextLine();
		getAnswer(s);
	}

	private void getAnswer(String s) {
		String ans = "";
		int count = 1;
		char c;
		for (int i = 0; i < s.length() - 1; i++) {
			c = s.charAt(i);
			if (c == s.charAt(i + 1))
				count++;
			else {
				ans = ans + c;
				if (count > 1)
					ans = ans + "" + count;
				count = 1;
			}
		}
		ans = ans + s.charAt(s.length() - 1);
		if (count > 1)
			ans = ans + count;
		System.out.println(ans);
	}

	private void getAnswerwithMap(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		String ans = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		for (int j = 0; j < s.length();) {
			char c = s.charAt(j);
			if (map.containsKey(c)) {
				if (map.get(c) != 1)
					ans = ans + c + "" + map.get(c);
				else
					ans = ans + c;
			}
			j = j + map.get(c);
		}
		System.out.println(ans);
	}

}
