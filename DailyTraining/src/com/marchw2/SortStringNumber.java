package com.marchw2;

public class SortStringNumber {

	public static void main(String[] args) {
		new SortStringNumber().getInput();
	}

	private void getInput() {
		String[] array = { "1", "-15", "35", "4", "0", "18" };
//		String[] array = { "1", "5", "3" };
		sortAscending(array);
		printArray(array);
	}

	private void printArray(String[] array) {
		for (String value : array) {
			System.out.print(value + " ");
		}
	}

	private void sortAscending(String[] array) {
		int minIndex, value, minValue;
		String temp;
		for (int i = 0; i < array.length; i++) {
			minIndex = i;
			minValue = getValue(array[minIndex].toCharArray());
			for (int j = i + 1; j < array.length; j++) {
				value = getValue(array[j].toCharArray());
				if (minValue > value) {
					minIndex = j;
					minValue = getValue(array[minIndex].toCharArray());
				}
			}
//			array[minIndex] = getValue(array[minIndex].toCharArray()) + getValue(array[i].toCharArray()) + "";
//			array[i] = getValue(array[minIndex].toCharArray()) - getValue(array[i].toCharArray()) + "";
//			array[minIndex] = getValue(array[minIndex].toCharArray()) - getValue(array[i].toCharArray()) + "";

			temp = array[minIndex];
			array[minIndex] = array[i];
			array[i] = temp;
		}
	}

	private int getValue(char[] array) {
		int answer = 0, k = 1;
		boolean isFound = false;
		for (int i = array.length - 1; i >= 0; i--) {
			if (i == 0 && array[i] == '-') {
				isFound = true;
				break;
			}
			answer = (array[i] - '0') * k + answer;
			k *= 10;
		}
		if (isFound) {
			return -1 * answer;
		}
		return answer;
	}

}
