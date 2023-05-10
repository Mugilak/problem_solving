package com.marchw2;

//enter elements : 
//2 -3 -4 5 9 7 8
//  2  5  9

import java.util.Scanner;

public class MaximumElements {
	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new MaximumElements().getInput();
	}

	private void getInput() {
//		int array[] = {2,-3,-4,5,9,7,8};
		int[] array = new int[7];
		int max = Integer.MIN_VALUE;
		System.out.println("enter elements : ");
		for (int i = 0; i < 7; i++) {
			int value = input.nextInt();
			if (max < value) {
				max = value;
				System.out.printf("%3d", value);
			}
		}
	}

}
