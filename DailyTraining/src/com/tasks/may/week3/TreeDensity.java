package com.tasks.may.week3;

public class TreeDensity {

	public static void main(String[] args) {
		System.out.println(new TreeDensity().density(4));
	}

	double density(int N) {
		// code here
		return (double) (N / findHeight(N));
	}

	double findHeight(int n) {
		int count = 0;
		while (n > 0) {
			count++;
			n /= 2;
		}
		return count;
	}

}
