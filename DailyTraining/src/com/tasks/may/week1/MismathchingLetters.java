package com.tasks.may.week1;

public class MismathchingLetters {

	public static void main(String[] args) {
		new MismathchingLetters().getInput();
	}

	private void getInput() {
		char array1[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i' };
		char array2[] = { 'a', 'b', 'd', 'e', 'e', 'g', 'g', 'i', 'i' };
		findMismatched(array1, array2);
	}

	private void findMismatched(char[] array1, char[] array2) {
		if (array1.length != array2.length) {
			System.out.println("Not equal length");
			return;
		}
		boolean found = false;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i]) {
				if (found) {
					System.out.print(" , ");
				}
				System.out.print(array1[i] + "" + array2[i]);
				found = true;
			}
		}
	}

}
