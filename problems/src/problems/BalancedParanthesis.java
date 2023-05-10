package problems;

import java.util.HashMap;
import java.util.Scanner;

public class BalancedParanthesis {

	public static void main(String[] args) {
		new BalancedParanthesis().getInput();
	}

	private void getInput() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String");
		String s = input.nextLine();
		if (!s.equals("0")) {
//			System.out.println(isValid(s) + "\n");
			System.out.println(balance(s) + "\n");
			getInput();
		} else {
			System.out.println("--Exited--");
		}
		input.close();
//		System.out.println(isBalanced(s));
	}

	private String isBalanced(String s) {
		isValid(s);
		HashMap<Character, Integer> h = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(' || c == ')' || c == '[' || c == ']' || c == '{' || c == '}') {
				if (h.containsKey(c)) {
					int num = h.get(c);
					h.put(c, num + 1);
				} else {
					h.put(c, 1);
				}
			}
		}
		int c1 = 0, c2 = 0, c3 = 0;
		if (h.containsKey('('))
			c1 = c1 + h.get('(');

		if (h.containsKey(')')) {
			c1 = c1 + h.get(')');
		}
		if (h.containsKey('['))
			c2 = c2 + h.get('[');

		if (h.containsKey(']')) {
			c2 = c2 + h.get(']');
		}
		if (h.containsKey('{'))
			c3 = c3 + h.get('{');
		if (h.containsKey('}')) {
			c3 = c3 + h.get('}');
		}

		int count = c1 + c2 + c3;
		if (count % 2 != 0)
			return "Unbalanced";

		return "Balanced";
	}

	private String isValid(String s) {
		int[] array = new int[3];
		for (int i = 0; i < s.length(); i++) {
			if ((array[0] != -1) && (array[1] != -1) && (array[2] != -1)) {
				char c = s.charAt(i);
				if (c == '(')
					array[0]++;
				else if (c == ')')
					array[0]--;
				else if (c == '[')
					array[1]++;
				else if (c == ']')
					array[1]--;
				else if (c == '{')
					array[2]++;
				else if (c == '}')
					array[2]--;
			} else

				return "Unbalanced";
		}
		if (array[0] == 0 && array[1] == 0 && array[2] == 0) {
			return "Balanced";
		}
		return "Unbalanced";
	}

	private StringBuilder balance(String s) {
		char wrongChar, temp, nextChar;
		int[] array = new int[3];
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			sb.append(s.charAt(i));
		}
//		System.out.println(sb.deleteCharAt(4));
		for (int i = 0; i < sb.length(); i++) {
//			if (s.charAt(i) - 'a' >= 0 && s.charAt(i) - 'a' <= 25) {
//				sb.append(s.charAt(i));
//			}
			if ((array[0] != -1) && (array[1] != -1) && (array[2] != -1)) {
				char c = sb.charAt(i);
				if (c == '(')
					array[0]++;
				else if (c == ')')
					array[0]--;
				else if (c == '[')
					array[1]++;
				else if (c == ']')
					array[1]--;
				else if (c == '{')
					array[2]++;
				else if (c == '}')
					array[2]--;
				if (array[0] < 0) {
					wrongChar = c;
					nextChar = sb.charAt(i + 1);
					if (i + 1 < sb.length() && nextChar == '(') {
						temp = wrongChar;
						sb.replace(i, i + 1, "(");
						sb.replace(i + 1, i + 2, ")");
						i++;
					} else if (i + 1 < sb.length() && i + 2 < sb.length() && nextChar == '(') {
						temp = wrongChar;
						sb.replace(i, i + 1, "(");
						sb.replace(i + 1, sb.length(), ")");
						i++;
					}
				} else if (array[1] < 0) {
					wrongChar = c;
					nextChar = sb.charAt(i + 1);
					if (i + 1 < sb.length() && nextChar == '[') {
						temp = wrongChar;
						sb.replace(i, i + 1, "[");
						sb.replace(i + 1, i + 2, "]");
						i++;
					} else if (i + 1 < sb.length() && i + 2 < sb.length() && nextChar == '[') {
						temp = wrongChar;
						sb.replace(i, i + 1, "[");
						sb.replace(i + 1, sb.length(), "]");
						i++;
					}
				} else if (array[2] < 0) {
					wrongChar = c;
					nextChar = sb.charAt(i + 1);
					if (i + 1 < sb.length() && nextChar == '{') {
						temp = wrongChar;
						sb.replace(i, i + 1, "{");
						sb.replace(i + 1, i + 2, "}");
						i++;
					} else if (i + 1 < sb.length() && i + 2 < sb.length() && nextChar == '{') {
						temp = wrongChar;
						sb.replace(i, i + 1, "{");
						sb.replace(i + 1, sb.length(), "}");
						i++;
					}
				}
			}
		}
		if (array[0] == 0 && array[1] == 0 && array[2] == 0) {
			return sb;
		}
//		else if(array[0] < 0 && array[1] < 0 && array[2] < 0)
		return sb;
	}

}
