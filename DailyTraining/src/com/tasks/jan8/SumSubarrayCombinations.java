package com.tasks.jan8;

import java.util.*;

//Enter Array size : 
//5
//Enter array elements : 
//1 2 3 4 5
//Enter target sum : 
//5
//output : 2 3

public class SumSubarrayCombinations {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new SumSubarrayCombinations().getInput();
	}

	private void getInput() {
		System.out.println("Enter Array size : ");
		int n = input.nextInt();
		System.out.println("Enter array elements : ");
		int[] array = new int[n];
		List<String> seq = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}
		System.out.println("Enter target sum : ");
		int k = input.nextInt();
		findAnswer(n, array, k, seq);
		printAnswer(seq);
	}

	private void printAnswer(List<String> seq) {
		if (seq.size() <= 0) {
			System.out.println("No possibles");
			return;
		}
		for (String combination : seq) {
			System.out.println(combination);
		}
	}

	private void findAnswer(int n, int[] array, int targetSum, List<String> list) {
		int k = n - 1, j = 0, sum = 0, temp = 0, len = 0;
		String word = "";
		while (k >= 1) {
			temp = k;
			sum = 0;
			word = "";
			for (j = 0; j < n; j++) {
				sum += array[j];
				word += array[j] + " ";
				if (j >= temp) {
					if (sum == targetSum) {
						word = word.strip();
						list.add(word);
					}
					len = (array[j - temp] + "").length();
					sum = sum - array[j - k];
					word = word.substring(len);
					word = word.stripLeading();
					temp++;
				}
			}
			k--;
		}
	}

}
