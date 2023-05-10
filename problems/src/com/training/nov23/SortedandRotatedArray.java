package com.training.nov23;

public class SortedandRotatedArray {

	public static void main(String[] args) {
		new SortedandRotatedArray().getInput();
	}

	private void getInput() {
		System.out.println(~(2000));
		System.out.println(check(new int[] { 3, 4, 1, 2 }));
	}

	public boolean check(int[] nums) {
		int i = 1, length = nums.length, count = 0;
		if (nums[length - 1] > nums[0]) {
			count++;
		}
		for (i = 0; i < length - 1; i++) {
			if (nums[i] > nums[i + 1]) {
				count++;
			}
		}
		if (count <= 1)
			return true;
		else
			return false;

	}
}
