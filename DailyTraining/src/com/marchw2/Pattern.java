package com.marchw2;

public class Pattern {
	public static void main(String args[]) {
		int n = 5;
		new Pattern().print(n);
	}

	public void print(int n) {
		int len = (n + " ").length();
		if (n == 10)
			len = 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j >= n - 1 - i) {
					System.out.printf("%" + len + "d", (n - j));
				} else
					System.out.printf("%" + len + "s", "");
			}
			System.out.println();
		}
	}
}