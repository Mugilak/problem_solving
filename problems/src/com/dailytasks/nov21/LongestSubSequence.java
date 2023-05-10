package com.dailytasks.nov21;

import java.util.*;

public class LongestSubSequence {
	private Scanner input = new Scanner(System.in);
	private Set<List<Integer>> set = new LinkedHashSet<>();

	public static void main(String[] args) {
		new LongestSubSequence().getInput();
	}

	private void getInput() {
		System.out.println("Enter n:");
		int n = input.nextInt();
		int[] array = new int[n];
		System.out.println("Enter array elements : ");
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}
		subArray(n, array);
	}

	private void subArray(int n, int[] array) {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				List<Integer> list = new ArrayList<Integer>();
				list.add(array[i]);
				findLargeSubArray(array, i, j, list);
			}
		}
		getMax();
	}

	private void getMax() {
		List<Integer> list = new ArrayList<Integer>();
		int max = 0, size;
		for (List<Integer> list2 : set) {
			size = list2.size();
			if (max < size) {
				max = size;
				list = list2;
			}
		}
		for (Integer num : list) {
			System.out.print(num + " ");
		}
	}

	private void findLargeSubArray(int[] array, int i, int j, List<Integer> list) {
		if (j == array.length) {
			set.add(list);
			return;
		}
		if (array[j] >= array[i]) {
			list.add(array[j]);
			findLargeSubArray(array, j, j + 1, list);
		} else
			findLargeSubArray(array, i, j + 1, list);
	}
}
