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
		System.out.println(findSequence(num)); // by loop
		String ans = findSequence(1, num); // by recursion
		System.out.println(ans);
	}

	public String findSequence(int num) {
		int rem = 0;
		String answer = "";
		while (num > 0) {
			rem = (num - 1) % 26;
			answer = ((char) (rem + 65)) + answer;
			num = (num - 1) / 26;
		}
		return answer == "" ? "Invalid" : answer;
	}

	private void findNumber(String s) {
		long number = 0, k = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			int value = (s.charAt(i) - 96);
			number += (value * (long) Math.pow(26, k));
			k++;
		}
		System.out.println(number);
	}

	private String findSequence(int i, int num) {
		if (num <= 0) {
			return "Invalid";
		}
		if (num <= 26) {
			return ((char) ((num) + 96)) + "";
		}
		if (num % 26 * i == 0)
			return findSequence(i, --num / 26) + 'z' + "";
		else
			return findSequence(++i, --num / 26) + ((char) ((++num % 26) + 96)) + "";
	}

}
