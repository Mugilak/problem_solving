package com.dailytasks.dec.dec8;

//Enter String : 
//aa
//27
//Enter num : 
//27
//aa

import java.util.*;

public class AlphabetsSeries {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new AlphabetsSeries().getInput();
	}

	private void getInput() {
		System.out.println("Enter String : ");
		String s = input.nextLine();
		findNumber(s);
		System.out.println("Enter num : ");
		int num = input.nextInt();
		String ans = findSequence(num);
		System.out.println(ans);
	}

	private void findNumber(String s) {
		long number = 0, k = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			number += ((s.charAt(i) - 96) * (long) Math.pow(26, k));
			k++;
		}
		System.out.println(number);
	}

	private String findSequence(int num) {
		if (num <= 0) {
			return "Invalid";
		}
		if (num <= 26) {
			return ((char) ((num) + 96)) + "";
		}
		if (num % 26 == 0)
			return findSequence(--num / 26) + 'z' + "";
		else
			return findSequence(--num / 26) + ((char) ((++num % 26) + 96)) + "";
	}

}
