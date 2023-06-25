package com.tasks.may.week3;

//input : 5
//output: 
//	  1
//	  2  6
//	  3  7 10
//	  4  8 11 13
//	  5  9 12 14 15

public class Pattern {

	public static void main(String[] args) {
		new Pattern().printPattern(5);
	}

	private void printPattern(int n) {
		int value, len = ((n * 3) + " ").length();
		for (int i = 0; i < n; i++) {
			value = i + 1;
			for (int j = 0; j <= i; j++) {
				if (j > 0) {
					value += (n - j);
				}
				System.out.printf("%" + len + "d", value);
			}
			System.out.println();
		}
	}

}
