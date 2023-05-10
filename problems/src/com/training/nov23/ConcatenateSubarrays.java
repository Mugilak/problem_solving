package com.training.nov23;

public class ConcatenateSubarrays {

	public static void main(String[] args) {
		new ConcatenateSubarrays().getInput();
	}

	private void getInput() {
//		int[][] groups = { { 1, -1, -1 }, { 3, -2, 0 } };
//		int[] nums = { 1, -1, 0, 1, -1, -1, 3, -2, 0 };
		int groups[][] = { { 10, -2 }, { 1, 2, 3, 4 } };
		int[] nums = { 1, 2, 3, 4, 10, -2 };
//		int[][] groups = { { -8490700 }, { -9218738 }, { -8142996, -2733527, -8835211, 6591339 } };
//		int[] nums = { -8490700, -9218738, -8142996, -2733527, -8835211, 6591339 };
		System.out.println(canChoose(groups, nums));
	}

	public boolean canChoose(int[][] groups, int[] nums) {
		int j = 0, prev = -1, index = 0, m = 0;
		for (int i = 0; i < groups.length; i++) {
			int len = groups[i].length;
			if (prev < index) {
				prev = index;
				index = isFound(i, len, groups, nums, m);
				m = index + 1;
				if (index == 0 & prev == 0) {
					prev = -1;
				}
				if (index == -1) {
					return false;
				}
			} else {
				return false;
			}
			j++;
		}
		return true;
	}

	private int isFound(int row, int len, int[][] groups, int[] nums, int i) {
		int k = 0, index = 0, length = nums.length;
		loop: while (i < length - (len - 1)) {
			for (k = i; index < len && k < len + i; k++) {
				if (groups[row][index++] != nums[k]) {
					i++;
					index = 0;
					continue loop;
				}
			}
			return k - 1;
		}
		return -1;
	}

}
