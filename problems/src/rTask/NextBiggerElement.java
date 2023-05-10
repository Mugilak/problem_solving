package rTask;

import java.util.Scanner;

public class NextBiggerElement {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new NextBiggerElement().getInput();
	}

	private void getInput() {
		int n = input.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}
		findNextBigger(n, array);
	}

	private void findNextBigger(int n, int[] array) {
		int ans, count;
		for (int i = 0; i < n; i++) {
			ans = Integer.MAX_VALUE;
			count = 0;
			for (int j = 0; j < n; j++) {
				if (array[j] > array[i] && (ans > array[j])) {
					ans = array[j];
					count++;
				}
			}
			if (count != 0)
				System.out.print(ans + " ");
			else
				System.out.print(array[i]+" ");
		}
	}

}
