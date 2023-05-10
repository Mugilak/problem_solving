package com.training.nov28;

public class RotateEvery {

	public static void main(String[] args) {
		new RotateEvery().getInput();
	}

	private void getInput() {
//		int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] array = { { 1, 2, 3, 4, }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int rowBegin = 0, rowEnd = array.length - 1, colBegin = 0, colEnd = array.length - 1, temp, temp1;
		while (colBegin < colEnd) {
			temp = array[rowBegin + 1][colBegin];
			for (int col = colBegin; col <= colEnd; col++) {
				temp1 = array[rowBegin][col];
				array[rowBegin][col] = temp;
				temp = temp1;
			}
			rowBegin++;
			for (int row = rowBegin; row <= rowEnd; row++) {
				temp1 = array[row][colEnd];
				array[row][colEnd] = temp;
				temp = temp1;
			}
			colEnd--;
			for (int col = colEnd; col >= colBegin; col--) {
				temp1 = array[rowEnd][col];
				array[rowEnd][col] = temp;
				temp = temp1;
			}
			rowEnd--;
			for (int row = rowEnd; row >= rowBegin; row--) {
				temp1 = array[row][colBegin];
				array[row][colBegin] = temp;
				temp = temp1;
			}
			colBegin++;
		}
		print(array);
	}

	private void print(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

}
