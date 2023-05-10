package com.marchw2;

import java.util.Scanner;

public class TriangularMatrix {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new TriangularMatrix().getInput();
	}

	private void getInput() {
		System.out.println("enter row ");
		int row = input.nextInt();
		System.out.println("enter column ");
		int col = input.nextInt(), count = 0;
		if (row == col) {
			System.out.println("enter elements:");
			int[][] matrix = new int[row][col];
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					matrix[i][j] = input.nextInt();
					if (matrix[i][j] == 0) {
						count++;
					}
				}
			}
			if (count != row * col)
				findUpperOrLower(row, col, row * col, matrix);
			else
				System.out.println("It is Zero matrix");
		} else {
			System.out.println("Matrix is not a square matrix!");
		}
	}

	private void findUpperOrLower(int row, int col, int total, int[][] matrix) {
		int count = (total - row) / 2, lLeftCount = 0, uLeftCount = 0, uRightCount = 0, lRightCount = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (i < j && matrix[i][j] == 0) { // left diagonal lower
					lLeftCount++;
				}
				if ((i + j) < (row - 1) && matrix[i][j] == 0) { // right diagonal lower
					lRightCount++;
				}
				if (i > j && matrix[i][j] == 0) { // left diagonal upper
					uLeftCount++;
				}
				if ((i + j) > (row - 1) && matrix[i][j] == 0) { // right diagonal upper
					uRightCount++;
				}
			}
		}
		if (lLeftCount == count || lRightCount == count) {
			System.out.println("Lower Triangular Matrix");
		} else if (uLeftCount == count || uRightCount == count) {
			System.out.println("Upper Triangular Matrix");
		} else {
			System.out.println("Not a triangular matrix");
		}
	}

}
// 1 2 3 4 0 6 7 8 0 0 9 2 0 0 0 1 -up
// 1 2 3 4 5 6 7 0 8 9 0 0 2 0 0 0 -up
// 1 0 0 0 2 3 0 0 4 5 6 0 7 8 9 0 -lower
// 0 0 0 1 0 0 2 3 0 4 5 6 7 8 9 1 -lower