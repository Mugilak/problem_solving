package com.tasks.august;

public class Pattern {

	public static void main(String[] args) {
		Pattern p = new Pattern();
		p.print(10);
		p.printWithoutBranching(4);
	}

	private void printWithoutBranching(int i) {
	}

	private void print(int n) {
		int value = 1, len = ((n * n) + " ").length();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
//				if (i % 2 == 0) {
//					System.out.printf("%" + len + "d", value++);
//				} else {
//					System.out.printf("%" + len + "d", --value);
//				}
				System.out.printf("%" + len + "d", ((i % 2 == 0) ? value++ : --value));
			}
			System.out.println();
			value += n;
		}
	}

}
