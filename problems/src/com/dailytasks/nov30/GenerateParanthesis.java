package com.dailytasks.nov30;

import java.util.Scanner;

public class GenerateParanthesis {
	private Scanner input = new Scanner(System.in);
	private int n;

	public static void main(String[] args) {
		new GenerateParanthesis().start();
	}

	private void start() {
		System.out.println("Enter input : ");
		n = input.nextInt();
		generateValidParanthesis("", n, n);
	}

	private void generateValidParanthesis(String string, int open, int close) {
		if (open == 0 && close == 0) {
			System.out.println(string);
			return;
		}
		if (open > 0) {
			generateValidParanthesis(string + "(", open - 1, close);
		}
		if (open < close) {
			generateValidParanthesis(string + ")", open, close - 1);
		}
	}
}
