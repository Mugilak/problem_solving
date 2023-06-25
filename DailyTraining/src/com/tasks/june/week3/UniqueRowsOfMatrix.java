package com.tasks.june.week3;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueRowsOfMatrix {

	public static void main(String[] args) {
		new UniqueRowsOfMatrix().getInput();
	}

	private void getInput() {
		int array[][] = { { 1, 1, 0, 0 }, { 1, 0, 0, 1 }, { 1, 1, 0, 0 } };
		getUniqueRows(array);
	}

	private void getUniqueRows(int[][] array) {
		String eachRow = "";
		Set<String> uniqueRows = new LinkedHashSet<>();
		for (int i = 0; i < array.length; i++) {
			eachRow = "";
			for (int j = 0; j < array[i].length; j++) {
				eachRow += array[i][j]+" ";
			}
			uniqueRows.add(eachRow);
		}
		printUniqueRows(uniqueRows);
	}

	private void printUniqueRows(Set<String> uniqueRows) {
		System.out.print("$");
		for (String row : uniqueRows) {
			System.out.print(row);
			System.out.print("$");
		}
	}

}
