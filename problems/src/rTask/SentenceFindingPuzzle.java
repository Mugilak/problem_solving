package rTask;

import java.util.*;

public class SentenceFindingPuzzle {
	private Set<String> words = new HashSet<>();

	public static void main(String[] args) {
		new SentenceFindingPuzzle().start();
	}

	private void start() {
		char[][] matrix = { { 'B', 'N', 'E', 'Y', 'S' }, { 'H', 'E', 'D', 'E', 'S' }, { 'S', 'G', 'N', 'D', 'E' } };
		String word = "DES", cordinate = "";
		int index = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == word.charAt(index)) {
					cordinate = word.charAt(index) + "(" + i + "," + j + ") ";
					findNextLetter(i, j, word, index + 1, matrix, cordinate);
				}
			}
		}
		for (String eachWord : words) {
			System.out.println(eachWord);
		}
	}

	private void findNextLetter(int i, int j, String word, int index, char[][] matrix, String cordinate) {
		if (index == word.length()) {
			words.add(cordinate);
			return;
		}
		String cordinates="";
		int row, col, rowLen = matrix.length, colLen = matrix[0].length;
		int[][] chances = { { 0, -1 }, { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, 1 }, { 1, 1 }, { 1, 0 }, { 1, -1 } };
		for (int k = 0; k < 8; k++) {
			row = i + chances[k][0];
			col = j + chances[k][1];
			if (row < 0) {
				row = rowLen - 1;
			} else if (row >= rowLen) {
				row = 0;
			}
			if (col < 0) {
				col = colLen - 1;
			} else if (col >= colLen) {
				col = 0;
			}
			if (matrix[row][col] == word.charAt(index)) {
				cordinates =cordinate+ word.charAt(index) + "(" + row + "," + col + ") ";
				findNextLetter(row, col, word, index + 1, matrix, cordinates);
			}
		}
	}

}
