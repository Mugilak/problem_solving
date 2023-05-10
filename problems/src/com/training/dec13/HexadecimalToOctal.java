package com.training.dec13;

import java.util.Scanner;

public class HexadecimalToOctal {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new HexadecimalToOctal().getInput();
	}

	private void getInput() {
		
		System.out.println("Enter hexadecimal value : ");
		String hex = input.nextLine();
	}

}
