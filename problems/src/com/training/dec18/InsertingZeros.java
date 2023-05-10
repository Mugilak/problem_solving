package com.training.dec18;

import java.util.Scanner;

public class InsertingZeros {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new InsertingZeros().getInput();
	}

	private void getInput() {
		System.out.println("Number of bits : ");
		int n = input.nextInt();
//		LinkedList<Integer> bits = new LinkedList<>();
		int bits[] = new int[n];
		System.out.println("Bits : ");
		for (int i = 0; i < n; i++) {
			int value = input.nextInt();
			if (value == 0 || value == 1) {
				bits[i] = value;
			} else {
				i--;
			}
//			bits.insertAtLast(value);   1 0 1 1 0 1 1 0 1 1 1 1
		}
		System.out.println("Enter consecutive : ");
		int k = input.nextInt();
		insertZerosAfterK(n, bits, k);
	}

	private void insertZerosAfterK(int n, int[] bits, int k) {
		int count = 0, j = 0;
		for (int i = 0; i < n; i++) {
			
			if (bits[i] == 1) {
				j = i;
				j++;
				count++;
				System.out.print(bits[i] + " ");
				while (j < n && bits[j] == 1 && count < k) {
					System.out.print(bits[j] + " ");
					count++;
					j++;
				}
				j--;
				if (count == k) {
					System.out.print("0 ");
					i = j;
				}
				count=0;
			} else {
				System.out.print(bits[i] + " ");
			}
		}
	}

}
