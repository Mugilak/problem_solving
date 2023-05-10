package rTask;

import java.util.Scanner;

public class UnMatchedPrinting {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new UnMatchedPrinting().getInput();
	}

	private void getInput() {
		System.out.println("Enter string 1 : ");
		String s1 = input.nextLine();
		System.out.println("Enter string 2 : ");
		String s2 = input.nextLine();
		findUnmatched(s1.toCharArray(), s2.toCharArray());
	}

	private void findUnmatched(char[] array1, char[] array2) {
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i]) {
				System.out.print(array1[i] + "" + array2[i]+" ");
			}
		}
	}

}
