package com.dailytasks.nov18;

import java.util.Scanner;

import com.dailytasks.nov17.SortByOrder;

public class TrainPlatforms {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new TrainPlatforms().getInput();
	}

	private void getInput() {
		System.out.println("Enter n:");
		int n = input.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter arrival elements : ");
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		int[] dep = new int[n];
		System.out.println("Enter departure elements : ");
		for (int i = 0; i < n; i++) {
			dep[i] = input.nextInt();
		}
		findPlatforms(n, arr, dep);
	}

	private void findPlatforms(int n, int[] arr, int[] dep) {
		int minPlatform = 1, result=1;
		for (int i = 0; i < n; i++) {
			minPlatform = 1;
			for (int j = 0; j < n; j++) {
				if (i != j)
					if (arr[i] >= arr[j] && dep[j] >= arr[i])
						minPlatform++;
			}
		}
		result = Math.max(result, minPlatform);
		System.out.println(minPlatform);
	}
}
//  0900 0940 0950 1100 1500 1800
//  0910 1200 1120 1130 1900 2000

//  0900 1100 1235
//  1000 1200 1240