package com.tasks.august;

//input : 13
//output : 17

public class CountingNumbers {
	public static void main(String[] args) {
		System.out.println(new CountingNumbers().countNumber(99));
	}

	private int countNumber(int n) {
		if (n <= 0) {
			return 0;
		}
		int count = 0, range = 9, digit = 1;
		while (n > range) {
			n = n - range;
			count += (digit * range);
			digit++;
			range = range * 10;
		}
		count += (digit * n);
		return count;
	}
}
