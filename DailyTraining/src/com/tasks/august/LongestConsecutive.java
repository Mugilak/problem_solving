package com.tasks.august;

import java.util.*;

public class LongestConsecutive {

	public static void main(String[] args) {
		new LongestConsecutive().getInput();
	}

	private void getInput() {
		int nums[] = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
		System.out.println(longestConsecutive(nums));
	}

	public int longestConsecutive(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		Arrays.sort(nums);
		int count = 1, max = 1;
		for (int i = 1; i < nums.length; i++) {
			if ((nums[i - 1] + 1) == nums[i]) {
				count++;
				if (max < count) {
					max = count;
				}
			} else if (nums[i - 1] != nums[i]) {
				count = 1;
			}
		}
		return max;
	}
}
