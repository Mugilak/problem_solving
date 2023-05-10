package com.training.dec18;

public class RouteFinding {

	public static void main(String[] args) {
		new RouteFinding().getInput();
	}

	private void getInput() {
		int n = 4;
		char[][] array = { { '1', '1', '0', '0' }, { '1', '0', '0', '1' }, { '1', '1', '1', '1' },
				{ '0', '0', '0', '1' } };
		array[0][0] = '_';
		if (findRoute(n, 0, 0, array)) {
			printArray(n, array);
		}else {
			System.out.println("no ways");
		}
	}

	private void printArray(int n, char[][] array) {
		for (char value[] : array) {
			for (char val : value)
				System.out.print(val + " ");
			System.out.println();
		}
	}

	private boolean findRoute(int n, int row, int column, char[][] array) {
		int[] move = { 0, 1, 0, -1, 0 };
		if (row == n - 1 && column == n - 1) {
			return true;
		}
		for (int i = 0; i < 4; i++) {
			int r = row + move[i];
			int c = column + move[i + 1];
			if (isSafe(r, c, n)) {
				if (array[r][c] == '1') {
					array[r][c] = '_';
					if (findRoute(n, r, c, array))
						return true;
					array[r][c] = '1';
				}
			}
		}
		return false;
	}

	private boolean isSafe(int row, int column, int n) {
		if (row >= 0 && column >= 0 && row < n && column < n) {
			return true;
		}
		return false;
	}

}
