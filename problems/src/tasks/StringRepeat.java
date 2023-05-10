package tasks;

import java.util.Scanner;
import java.util.Stack;

public class StringRepeat {
	private Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		new StringRepeat().getInput();
	}

	private void getInput() {
		System.out.println("Enter String : ");
		String str = s.nextLine();
		System.out.println("Enter Index : ");
		int index = s.nextInt();
		answer(str, index);
	}

	private void answer(String str, int index) {
		String each = "";
		StringBuilder sb = new StringBuilder();
		int value;
		loop: for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			value = c - '0';
				if (value >= 0 && value <= 9) {
					for (int j = 1; j < value; j++) {
						if (sb.length() >= index) {
							break loop;
						}
						sb.append(each);
						if (j == value - 1) {
							each = each + each;
						}
					}
				} else {
					if (sb.length() >= index) {
						break loop;
					}
					sb.append(c);
					each = each + c;
				}
		}
		System.out.println(sb);
		System.out.println(String.valueOf(sb.charAt(index - 1)));
	}
}
