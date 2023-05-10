package com.marchw2;

import java.util.Scanner;

public class CenterElement {
	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new CenterElement().getInput();
	}

	private void getInput() {
		int n = input.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = input.nextInt();
		}
		System.out.println(findElement(a, n));
	}

	public int findElement(int a[], int n) {
		int i = 0, j = 1, temp = 0;
		while (i < n - 1 && j < n) {
			if (a[j] >= a[i]) {
				if (j < n - 1) {
					i = j;
					j = i + 1;
				}else {
					j++;
				}
			} else {
				temp = j + 1;
				while (temp < n && a[temp] < a[i]) {
					temp++;
				}
				i = temp;
				j = i + 1;
			}
		}
		if (temp < n - 1 && i > 0)
			return a[i];
		else
			return -1;
	}

}
