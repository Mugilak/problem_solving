package tasks;

import java.util.Scanner;

public class TwoSum {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new TwoSum().getInput();
	}

	private void getInput() {
		System.out.println("Enter size : ");
		int n = input.nextInt();
		int[] array = new int[n];
		System.out.println("Enter array elements : ");
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}
		System.out.println("Enter target : ");
		int t = input.nextInt();
		findIndex(n, array, t);
	}

	private void findIndex(int n, int[] array, int t) {
		int value = 0, count = 0;
		for (int i = 0; i < n; i++) {
			value = Math.abs(array[i] - t);
			for (int j = 0; j < n; j++) {
				if (i != j && value == array[j]) {
					count++;
					System.out.println("index 1 = " + (i + 1) + ", index 2 = " + (j + 1));
					return;
				}
			}
		}
		if (count == 0)
			System.out.println("no possibles");
	}

}
