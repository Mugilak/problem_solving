package com.tasks.june.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueRowsOfMatrix {

	public static void main(String[] args) {
		new UniqueRowsOfMatrix().getInput();
	}

	private void getInput() {
		int array[][] = { { 1, 1, 0, 0 }, { 1, 0, 0, 1 }, { 1, 1, 0, 0 } };
		getUniqueRows(array);
//		getUniqueRowsUsingSet(array);
	}

	private void getUniqueRows(int[][] array) {
		start: for (int i = 0; i < array.length; i++) {
			row: for (int j = i - 1; j >= 0; j--) {
				for (int col = 0; col < array[j].length; col++) {
					if (array[i][col] != array[j][col]) {
						continue row;
					}
				}
				continue start;
			}
			print(array[i]);
		}
	}

	private void print(int[] row) {
		System.out.print("$ ");
		for (int value : row) {
			System.out.print(value + " ");
		}
	}

	private void getUniqueRowsUsingSet(int[][] array) {
		String eachRow = "";
		Set<String> uniqueRows = new LinkedHashSet<>();
		for (int i = 0; i < array.length; i++) {
			eachRow = "";
			for (int j = 0; j < array[i].length; j++) {
				eachRow += array[i][j] + " ";
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
