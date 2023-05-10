package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new TwoSum().getInput();
	}

	private void getInput() {
		System.out.println("Enter array size : ");
		int n = input.nextInt();
		System.out.println("Enter array elements : ");
		int nums[] = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = input.nextInt();
		}
		System.out.println("Enter Target : ");
		int target = input.nextInt();
		System.out.println(Arrays.toString(twoSum(nums, target)));
	}

	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int i = 0, complement = 0;
		for (Integer a : nums) {
			map.put(a, i++);
		}
		for (i = 0; i < nums.length; i++) {
			if (nums[i] <= target || (nums[i] <= 0 && nums[i] >= target))
				complement = target - nums[i];
			if (map.containsKey(complement) && i != map.get(complement)) {
				return new int[] { i, map.get(complement) };
			}
		}
		return new int[] {};
	}
}