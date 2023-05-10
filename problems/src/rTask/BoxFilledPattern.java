package rTask;

import java.util.*;

public class BoxFilledPattern {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new BoxFilledPattern().getInput();
	}

	private void getInput() {
		System.out.println("Enter n:");
		int n = input.nextInt();
//		printPattern(n, ((2 * n) - 1) * ((2 * n) - 1));
//		print(n);
		fillPattern(n);
		System.out.println();
		XOPattern(n);
//		pattern(n);
	}

	private void fillPattern(int n) {
		int v1, v2;
		for (int i = 1; i < (2 * n); i++) {
			for (int j = 1; j < (2 * n); j++) {
				v1 = (i - n) < 0 ? -1 * (i - n) : i - n;
				v2 = (j - n) < 0 ? -1 * (j - n) : j - n;
				System.out.print(v1 < v2 ? (v2 + 1) + " " : (v1 + 1) + " ");
			}
			System.out.println();
		}
	}

	private void XOPattern(int n) {
		int v1, v2,v3;
		for (int i = 1; i < (2 * n); i++) {
			for (int j = 1; j < (2 * n); j++) {
				v1 = (i - n) < 0 ? -1 * (i - n) : i - n;
				v2 = (j - n) < 0 ? -1 * (j - n) : j - n;
				v3=v1 < v2 ? (v2 + 1): (v1 + 1);
				System.out.print(n%2==0?(v3)%2==0 ? "X ":"O ":(v3)%2==0 ? "O ":"X ");
//				if(v1<v2) {
//					System.out.print((v2+1)%2==0 ? "X ":"O ");
//				}else {
//					System.out.print((v1+1)%2==0 ? "O ":"X ");
//				}
			}
			System.out.println();
		}
	}

	private void pattern(int n) {
		int v1, v2;
		for (int i = 1; i < (2 * n); i++) {
			for (int j = 1; j < (2 * n); j++) {
				v1 = (i - n) < 0 ? -1 * (i - n) : i - n;
				v2 = (j - n) < 0 ? -1 * (j - n) : j - n;
				System.out.print(v1 < v2 ? "X " : "O ");
			}
			System.out.println();
		}
	}

	private void print(int n) {
		int size, i, j;
		size = 4;

		for (i = size; i >= 0; i--) {
			for (j = size; j >= 0; j--) {
				System.out.print(Math.max(Math.abs(i - n), Math.abs(j - n)) + " ");
			}
			System.out.println();
		}
	}

	private void printPattern(int n, int total) {
		int j = 1;
		for (int i = 0; i < total; i++) {

			if (i == ((2 * n) - 1) * j) {
				System.out.println();
				j++;
			}
		}
	}

}
