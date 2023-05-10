package rTask;

import java.util.Scanner;

public class RotateArray {
	private Scanner input = new Scanner(System.in);
	private int[][] array;

	public static void main(String[] args) {
		new RotateArray().getInput();
	}

	private void getInput() {
		System.out.println("Enter row size :");
		int row = input.nextInt();
		System.out.println("Enter column size : ");
		int col = input.nextInt();
		if (row == col) {
			array = new int[row][col];
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					array[i][j] = input.nextInt();
				}
			}
			rotateAntiClockWise(row);
//			rotateAntiClockwise(row);
		}
	}

	private void rotateAntiClockWise(int rows) {
		getTranspose(rows);
		int row = rows - 1;
		for (int i = 0; row >= rows / 2 && i < rows; i++) {
			for (int j = 0; j < rows; j++) {
				swap(i, row, j);
			}
			row--;
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	private void swap(int i, int row, int j) {
		int temp = array[i][j];
		array[i][j] = array[row][j];
		array[row][j] = temp;
	}

	private void getTranspose(int row) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				if (i < j) {
					swap(i, j);
				}
			}
		}
	}

	private void swap(int i, int j) {
		array[i][j] = array[i][j] + array[j][i];
		array[j][i] = array[i][j] - array[j][i];
		array[i][j] = array[i][j] - array[j][i];
	}

	private void rotateAntiClockwise(int row) {
		int[][] rotated = new int[row][row];
		int col = row - 1;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				rotated[i][j] = array[j][col];
			}
			col--;
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print(rotated[i][j] + " ");
			}
			System.out.println();
		}
	}

}
