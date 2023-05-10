package com.dailytasks.nov26;

public class DictionaryWordSearch {
	private boolean isFound;

	public static void main(String[] args) {
		new DictionaryWordSearch().getInput();
	}

	private void getInput() {
		char[][] board = { { 'a', 'z', 'o', 'l' }, { 'n', 'x', 'h', 'o' }, { 'v', 'y', 'i', 'v' },
				{ 'o', 'r', 's', 'e' } };
		String word;
		int k;
		String[] dictionary = { "van", "zoho", "love", "are", "is" };
		for (int each = 0; each < dictionary.length; each++) {
			k = 0;
			isFound = false;
			word = dictionary[each];
			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board[0].length; j++) {
					if (board[i][j] == word.charAt(k)) {
						findNext(board, i, j, word, k + 1);
					}
				}
			}
			if (isFound) {
				System.out.println(dictionary[each]);
			}
		}
	}

	private void findNext(char[][] board, int rows, int cols, String word, int index) {
		if (index == word.length()) {
			isFound = true;
			return;
		}
		int chances[][] = { { 0, 1 }, { 1, 0 } };
		int row, col, len = board.length;
		for (int i = 0; i < 2; i++) {
			row = rows + chances[i][0];
			col = cols + chances[i][1];
			if (row >= 0 && row < len && col >= 0 && col < len) {
				if (board[row][col] == word.charAt(index)) {
					char c = board[row][col];
					board[row][col] = '*';
					findNext(board, row, col, word, index + 1);
					board[row][col] = c;
				}
			}
		}
	}
}
