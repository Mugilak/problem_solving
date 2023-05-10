package com.training.nov28;

import java.util.Scanner;

public class ValidExpression {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new ValidExpression().getInput();
	}

	private void getInput() {
		String exp = input.nextLine();
		System.out.println(isValid(exp.toCharArray()) ? "Valid" : "Invalid");
	}

	private boolean isValid(char[] exp) {
		int bracket = 0, length = exp.length;
		for (int i = 0; i < length; i++) {
			if (exp[i] == '(') {
				if (i + 1 < length && exp[i + 1] == ')') {
					return false;
				}
				bracket++;
			} else if (exp[i] == ')') {
				bracket--;
			} else if (exp[i] == '+' || exp[i] == '-' || exp[i] == '*' || exp[i] == '/') {
				if ((i + 1 < length) && ((int) (exp[i + 1]) < 97 || (int) (exp[i + 1]) > 122)) {
					return false;
				}
				if (i - 1 >= 0 && exp[i - 1] < 97 || exp[i - 1] > 122)
					return false;
			} else {
				if (i + 1 < length && (exp[i + 1] >= 97 || exp[i + 1] <= 122)) {
					return false;
				}
			}
		}
		if (bracket != 0)
			return false;
		return true;
	}

}
