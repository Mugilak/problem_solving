package com.tasks.may.week2;

import java.util.*;

// 3 4 33 34 43 44 333 334 343 344 

public class NumberSequence {

	public static void main(String[] args) {
		new NumberSequence().createSequence(10, "3", "4");
	}

	private void createSequence(int total, String... array) {
		List<String> list = new ArrayList<>(Arrays.asList(array));
		int i = 0;
		String newValue = "";
		for (String value : array) {
			System.out.print(value + " ");
		}
		while (true) {
			newValue = list.get(i) + 3;
			System.out.print(newValue+" ");
			list.add(newValue);
			newValue = list.get(i) + 4;
			System.out.print(newValue+" ");
			list.add(newValue);
			i++;
			if (list.size() == total) {
				break;
			}
		}
//		createSequenceByRecursion("3", "4");
	}

	private void findSequenceByRecursion(String first, String second) {
		if (first.length() == 4) {
			return;
		}
		System.out.println(first);
		System.out.println(second);
		findSequenceByRecursion(first + 3, second + 3);
		findSequenceByRecursion(first + 4, second + 4);
	}

}
