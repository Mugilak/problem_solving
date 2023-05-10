package rTask;

import java.util.Scanner;

public class PowerFinding {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new PowerFinding().getInput();
	}

	private void getInput() {
		System.out.println("Enter size : ");
		int n = input.nextInt();
		int[] array = new int[n];
		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}
		System.out.println("Enter power :");
		int power = input.nextInt();
		printPower(n, array, power);
	}

	private void printPower(int n, int[] array, int power) {
		for (int i = 0; i < n; i++) {
			if (i == n - 1) {
				System.out.print(findPower(array[i], power) + "");
			} else
				System.out.print(findPower(array[i], power) + ", ");
		}
	}

	private int findPower(int base, int power) {
		int missed = 1;
		while (power > 1) {
			if (power % 2 != 0) {
				missed *= base;
			}
			base = base * base;
			power /= 2;
		}
		return base * missed;
	}

}
