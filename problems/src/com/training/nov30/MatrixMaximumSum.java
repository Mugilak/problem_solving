package com.training.nov30;

import java.util.Scanner;

public class MatrixMaximumSum {
//	private Scanner input = new Scanner(System.in);
	private String maxPath;
	int[][] matrix = { { 15, 25, 300 }, { 45, 25, 60 }, { 70, 75, 10 } };
	int max;

	public static void main(String[] args) {
		new MatrixMaximumSum().getInput();
	}

	private void getInput() {
		max = matrix[0][0];
		maxPath = max + "";
		findMaxPath(0, 0, max, maxPath + "->");
		System.out.println(maxPath + "  sum is " + max);
	}

	private void findMaxPath(int row, int col, int sum, String path) {
		int rows, cols, len = matrix.length;
		int move[][] = { { 0, 1 }, { 1, 0 } };
		for (int i = 0; i < 2; i++) {
			rows = row + move[i][0];
			cols = col + move[i][1];
			if (rows >= 0 && cols >= 0 && rows < len && cols < len) {
				if (rows == len - 1 && cols == len - 1) {
					String sumPath = path + "" + matrix[rows][cols];
					sum += matrix[rows][cols];
					if (max < sum) {
						max = sum;
						maxPath = sumPath;
					}
				} else {
					String sumPath = path + "" + matrix[rows][cols] + "->";
					findMaxPath(rows, cols, matrix[rows][cols] + sum, sumPath);
				}
			}
		}
	}

}
