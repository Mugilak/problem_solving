package com.dailytasks.nov19;

import java.util.Scanner;

public class BoxPattern {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new BoxPattern().getInput();
	}

	private void getInput() {
		System.out.println("Enter n : ");
		int n = input.nextInt();
		printPattern(n);
	}

	private void printPattern(int n) {
		
	}
}
