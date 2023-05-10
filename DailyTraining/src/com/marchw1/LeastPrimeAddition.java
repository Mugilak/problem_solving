package com.marchw1;

//Enter n :
//2
//Array 1 :
//20 7
//Array 2:
//11 5
//2 3

import java.util.Scanner;

public class LeastPrimeAddition {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new LeastPrimeAddition().getInput();
	}

	private void getInput() {
		System.out.println("Enter array size :");
		int n = input.nextInt();
		int array[] = new int[n];
		int array2[] = new int[n];
		System.out.println("Array 1 :");
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}
		System.out.println("Array 2:");
		for (int i = 0; i < n; i++) {
			array2[i] = input.nextInt();
		}
		findLeastPrimeAddition(n, array, array2);
//		addWithLeastPrime(n, array, array2);
	}

	private void findLeastPrimeAddition(int n, int[] array, int[] array2) {
		int index = 1, value = 0;
		for (int i = 0; i < n; i++) {
			index = 1;
			while (true) {
				value = Math.abs(array[i] - (index * array2[i]));
				index++;
				if (value >= 1000) {
					System.out.print(" -1 ");
					break;
				}
				if (isPrimeNumber(value)) {
					System.out.print(value + " ");
					break;
				}
			}
		}
	}

	private boolean isPrimeNumber(int value) {
		int temp = value, i = 2;
		while (temp > i) {
			if (value % i == 0) {
				return false;
			}
			temp /= i;
			i++;
		}
		return true;
	}

	private void addWithLeastPrime(int n, int[] array, int[] array2) {
		int index = 1;
		loop: for (int i = 0; i < n; i++) {
			index = 1;
			for (int j = 1; j < 1000; j++) {
				index++;
				if (isPrime(j)) {
					if ((j + array[i]) % array2[i] == 0) {
						System.out.print(j + " ");
						continue loop;
					}
				}
			}
			System.out.print(" -1 ");
		}
	}

	private boolean isPrime(int value) {
		for (int i = 2; i <= value / 2; i++) {
			if (value % i == 0) {
				return false;
			}
		}
		if (value > 0)
			return true;
		else
			return false;
	}

}
