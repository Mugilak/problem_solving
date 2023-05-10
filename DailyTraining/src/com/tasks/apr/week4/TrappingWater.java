package com.tasks.apr.week4;

//Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
//Output: 6
//Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
//Example 2:
//
//Input: height = [4,2,0,3,2,5]
//Output: 9

public class TrappingWater {

	public static void main(String[] args) {
		new TrappingWater().getInput();
	}

	private void getInput() {
//		int input[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		int input[] = { 4, 2, 0, 3, 2, 5 };
		findTrappedWater(input);
	}

	private void findTrappedWater(int[] input) {
		int trappedWater = 0, start = 0, last = input.length - 1, sMax = 0, lMax = 0;
		while (start < last) {
			sMax = (sMax < input[start]) ? input[start] : sMax;
			lMax = (lMax < input[last]) ? input[last] : lMax;
			if (sMax < lMax) {
				trappedWater += (sMax - input[start]);
				start++;
			} else {
				trappedWater += (lMax - input[last]);
				last--;
			}
		}
		System.out.println(trappedWater);
	}

}
