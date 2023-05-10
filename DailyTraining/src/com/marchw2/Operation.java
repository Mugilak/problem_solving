package com.marchw2;

public class Operation {
	public static void main(String args[]) {
//		String input = "1234*";
//		String input = "374291--*+-";
		String input = "67542-/+-";
		new Operation().perform(input.toCharArray());
	}

	void perform(char[] input) {
		int numStart = 0, operatorStart = 0, value1 = 0, value2 = 0;
		if (input.length == 1 || input.length % 2 == 0) {
			System.out.println("Invalid input");
			return;
		} else {
			if (input[input.length / 2 + 1] == '-' || input[input.length / 2 + 1] == '+'
					|| input[input.length / 2 + 1] == '*' || input[input.length / 2 + 1] == '/'
					|| input[input.length / 2 + 1] == '%') {
				operatorStart = (input.length / 2) + 1;
			} else {
				System.out.println("Invalid input");
				return;
			}
		}
		int temp = operatorStart;
		numStart = 0;
		value1 = input[numStart++] - '0';
		value2 = input[numStart] - '0';
		while (numStart < temp && operatorStart < input.length) {
			try {
				value1 = find(value1, value2, input[operatorStart++]);
				numStart++;
				value2 = input[numStart] - '0';
			} catch (ArithmeticException e) {
				System.out.println("Cannot divide by zero !");
			} catch (Exception e) {
				System.out.println("Invalid input");
			}
		}
		System.out.println(value1);
	}

	int find(int v1, int v2, char op) {
		switch (op) {
		case '+':
			return v1 + v2;
		case '-':
			return v1 - v2;
		case '*':
			return v1 * v2;
		case '/':
			if (v2 == 0) {
				throw new ArithmeticException();
			}
			return v1 / v2;
		case '%':
			return v1 % v2;
		}
		return 0;
	}

}
