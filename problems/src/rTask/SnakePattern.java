package rTask;

import java.util.Scanner;

public class SnakePattern {
	public static void main(String[] args) {
		new SnakePattern().entry();
	}

	private void entry() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Input : ");
			int input = sc.nextInt();
			printSnake(input);
		}
	}

	private void printSnake(int input) {
		int rows = input, columns = input + (input - 1);
		int values = 0;
		int s = (input * input + " ").length();
		for (int row = 1; row <= rows; row++) {
			for (int space = 1; space <= columns - rows; space++) {
				System.out.printf(" ");
			}
			for (int col = (columns - (rows - 1)); col <= columns; col++) {
				if (row % 2 != 0)
					System.out.printf("%" + s + "d", (++values));
				else
					System.out.printf("%" + s + "d", (values--));
			}
			values += input;
			columns--;
			System.out.println();
		}
	}
}
