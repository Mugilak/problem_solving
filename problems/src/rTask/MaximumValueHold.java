package rTask;

import java.util.Scanner;

public class MaximumValueHold {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new MaximumValueHold().getInput();
	}

	private void getInput() {
		System.out.println("Enter size : ");
		int n = input.nextInt(), val, hold, excess = 0;
		int[] array = new int[n];
		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			val = input.nextInt();
			val = val + excess;
			hold = findItsHoldable(val, 1);
			array[i] = hold;
			excess = val - hold;
			excess = excess < 0 ? (-1 * excess) : excess;
		}
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\n" + excess);
	}

	private int findItsHoldable(int val, int a) {
		int b = a * 2;
		while (b <= val) {
			a = a << 1;
			b = a * 2;
		}
		return a;
	}
// 39 121 12 23 8
// 12 25 10 7 8
}
