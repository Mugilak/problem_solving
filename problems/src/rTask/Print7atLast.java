package rTask;

import java.util.Arrays;
import java.util.Scanner;

public class Print7atLast {
	private Scanner input = new Scanner(System.in);
	private int[] array;

	public static void main(String[] args) {
		new Print7atLast().getInput();
	}

	private void getInput() {
		System.out.println("Enter size : ");
		int n = input.nextInt();
		System.out.println("enter array elements : ");
		array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}
		sortSevenAtLast(n);
		System.out.println(Arrays.toString(array));
	}

	private void sortSevenAtLast(int n) {
		int j,count=0;
		for (int i = 0; i < n - count; i++) {
			if (array[i] == 7) {
				count++;
				j = i + 1;
				while (j < n && array[i] == array[j]) {
					j++;
				}
				if (j < n)
					doSwap(i, j);

			}
		}
	}

	private void doSwap(int i, int j) {
		array[i] = array[i] + array[j];
		array[j] = array[i] - array[j];
		array[i] = array[i] - array[j];
	}

}
