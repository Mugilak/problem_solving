package rTask;

import java.util.Scanner;

class SpiralForm {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new SpiralForm().getInput();
	}

	private void getInput() {
		System.out.println("Enter row : ");
		int row = input.nextInt();
		System.out.println("Enter column : ");
		int column = input.nextInt();
		doPattern(row, column);
	}

	private void doPattern(int r, int c) {
		int array[][] = new int[r][c];
		int value = -1, rowBegin = 0, rowEnd = r - 1, colBegin = 0, colEnd = c - 1, length = ((r * c) + " ").length();
		while (colBegin <= colEnd) {
			for (int i = rowBegin; i <= colEnd; i++) {
				array[rowBegin][i] = ++value;
			}
			rowBegin++;
			for (int i = rowBegin; i <= rowEnd; i++) {
				array[i][colEnd] = ++value;
			}
			colEnd--;
			for (int i = colEnd; i >= colBegin; i--) {
				array[rowEnd][i] = ++value;
			}
			rowEnd--;
			for (int i = rowEnd; i >= rowBegin; i--) {
				array[i][colBegin] = ++value;
			}
			colBegin++;
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.printf("%" + length + "d", array[i][j]);
			}
			System.out.println();
		}
	}

}
