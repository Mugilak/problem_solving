package rTask;

import java.util.Scanner;

public class RangePrinting {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new RangePrinting().getInput();
	}

	private void getInput() {
		int n = input.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}
		int x = input.nextInt();
		int y = input.nextInt();
		if (x < y) {
			printRange(n, array, x, y);
		} else
			System.out.println("invalid x and y");
	}

	private void printRange(int n, int[] array, int x, int y) {
		for (int i = 0; i < n; i++) {
			if (array[i] > x && array[i] < y) {
				System.out.print(array[i] + " ");
			}
		}
	}

}
