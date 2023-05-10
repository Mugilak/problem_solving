package rTask;

import java.util.Scanner;

public class ReverseSubArray {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new ReverseSubArray().getInput();
	}

	private void getInput() {
		System.out.println("Enter size : ");
		int n = input.nextInt();
		int[] array = new int[n];
		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}
		System.out.println("Enter k:");
		int k = input.nextInt();
		split(n, array, k);
	}

	private void split(int n, int[] array, int k) {
		for (int i = 0; i < n; i += k) {
			if (i + (k - 1) < n) {
				reverse(array, i, i + (k - 1));
			} else {
				reverse(array, i, n - 1);
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
	}

	private void reverse(int[] array, int start, int last) {
		while (start < last) {
			swap(array, start, last);
			start++;
			last--;
		}
	}

	private void swap(int[] array, int start, int last) {
		int temp = array[start];
		array[start] = array[last];
		array[last] = temp;
	}

}
