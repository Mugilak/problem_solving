package com.tasks.may.day5;

//input : a = 0, b = 15
//output: -15

public class Subtraction {

	public static void main(String[] args) {
		new Subtraction().getInput();
	}

	private void getInput() {
		int a = 0, b = 15;
		System.out.println(subtract(a, b));
	}

	private int subtract(int a, int b) {
		int borrow = 0;
		while (b != 0) {
			borrow = (~a) & b;
			a = a ^ b;
			b = borrow << 1;
		}
		return a;
	}

}
