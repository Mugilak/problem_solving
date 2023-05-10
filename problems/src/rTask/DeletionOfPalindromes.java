package rTask;

import java.util.Scanner;

public class DeletionOfPalindromes {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new DeletionOfPalindromes().getInput();
	}

	private void getInput() {
		System.out.println("Entera sntence : ");
		String sentence = input.nextLine();
		ReemovePalindomes(sentence);
	}

	private void ReemovePalindomes(String sentence) {
		int length = sentence.length();
		if (length == 0) {
			System.out.println("''");
		}
		String word = "", answer = "";
		for (int i = 0; i < length; i++) {
			if (sentence.charAt(i) != ' ') {
				word += sentence.charAt(i);
			} else {
				if (!(isPalindrome(word))) {
					answer += word + " ";
				}
				word = "";
			}
		}
		if (!(isPalindrome(word))) {
			answer += word + " ";
		}
		System.out.println(answer);
	}

	private boolean isPalindrome(String eachWord) {
		int i = 0, j = eachWord.length() - 1;
		while (i < j) {
			if (eachWord.charAt(i++) != eachWord.charAt(j--)) {
				return false;
			}
		}
		return true;
	}

}
