package com.tasks.apr.day18;

public class ArithmeticOperation {

	public static void main(String[] args) {
		new ArithmeticOperation().getInput();
	}

	private void getInput() {
		int a = 10, b = 4;
		System.out.println(add(a, b));
		System.out.println(multiply(a, b));
	}

	private int add(int a, int b) {
		int result = 0;

		return result;
	}

	private void multiplyByFormula(int a, int b) {
		int value = (int) (Math.pow((a + b), 2) - (int) Math.pow(a, 2) - (int) Math.pow(b, 2));
		System.out.println(value / 2);
	}

	private int multiply(int a, int b) {
		int result = 0, temp = b;
		b = Math.abs(b);
		while (b > 0) {
			if (b % 2 != 0) {
				result += a;
			}
			a = a << 1;
			b = b >> 1;
		}
		if (temp < 0) {
			result = -result;
		}
		return result;
	}

}
