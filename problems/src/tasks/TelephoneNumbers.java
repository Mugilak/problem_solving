package tasks;

import java.util.Scanner;

public class TelephoneNumbers {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new TelephoneNumbers().getInput();
	}

	private void getInput() {
		System.out.println("Enter numbers : ");
		String num = input.nextLine();
		printMsg(num);
	}

	private void printMsg(String num) {
		int len = num.length(), count;
		char value;
		String ans = "";
		for (int i = 0; i < len;) {
			count = 0;
			value = num.charAt(i);
			if (value == '1') {
				ans += " ";
			} else if (value > '1' && value <= '9') {
				while ((i + 1) < len && (value == num.charAt(i + 1))) {
					count++;
					i++;
				}
				int n = value - '0';
				if (n == 2 || n == 4 || n == 6 || n == 3 || n == 5 || n == 7) {
					ans += (char) ((97 + (((n - 2) * 3))) + count);
				} else if (n == 8 || n == 9) {
					ans += (char) ((97 + (((n - 2) * 3) + 1)) + count);
				}
			}
			i++;
		}
		if (num.charAt(0) == '#')
			ans = ans.toUpperCase();
		System.out.println(ans);
	}
}
