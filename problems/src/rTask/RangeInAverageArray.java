package rTask;

import java.util.Scanner;

public class RangeInAverageArray {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new RangeInAverageArray().getInput();
	}

	private void getInput() {
		System.out.println("Enter size : ");
		int n = input.nextInt(), sum = 0;
		int[] array = new int[n];
		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
			sum += array[i];
		}
		double avg = (double) sum / n;
		findNearestNumber(n, array, avg);
	}

	private void findNearestNumber(int n, int[] array, double avg) {
		int nearMin = Integer.MIN_VALUE, nearMax = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			if (array[i] == avg) {
				System.out.println(array[i]);
				return;
			}
			if (array[i] < avg && array[i] > nearMin) {
				nearMin = array[i];
			}
			if (array[i] > avg && array[i] < nearMax) {
				nearMax = array[i];
			}
		}
		if (nearMax - avg < avg - nearMin) {
			System.out.println(nearMax);
		} else
			System.out.println(nearMin);
	}

}
