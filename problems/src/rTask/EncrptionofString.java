package rTask;

import java.util.Scanner;

public class EncrptionofString {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new EncrptionofString().getInput();
	}
	public static void main(String[] args, int a) {
		System.out.println("10");
		new EncrptionofString().getInput();
	}

	private void getInput() {
		System.out.println("Input 1 : ");
		String s1 = input.nextLine();
		System.out.println("Input 2 : ");
		String key = input.nextLine();
		System.out.println(encryptString(s1, key));
	}

	private String encryptString(String s1, String key) {
		String encrypted = "";
		int len = s1.length(), value, value2, total;
		for (int i = 0; i < len; i++) {
			value = s1.charAt(i);
			value2 = key.charAt(i) - 96;
			total = value + value2;
			if (total > 122) {
				total = 96 + (total - 122);
			}
			encrypted = encrypted + (char) total;

		}
		return encrypted;
	}

}
