package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Subsets {
	private Scanner input = new Scanner(System.in);
	List<List<Integer>> result = new ArrayList<>();

	public static void main(String[] args) {
		new Subsets().getInput();
  	}

	private void getInput() {
		System.out.println("Enter n:");
		int n = input.nextInt();
		int[] array = new int[n];
		System.out.println("Enter array elements : ");
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}
		subset(0, new ArrayList(), array);
		System.out.println(result);
	}

	public void subset(int index, List<Integer> inner, int[] nums) {
		result.add(new ArrayList<>(inner));
		for (int i = index; i < nums.length; i++) {
			inner.add(nums[i]);
			subset(i + 1, inner, nums);
			inner.remove(inner.size() - 1);
		}
	}
}
