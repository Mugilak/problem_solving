package com.tasks.june.week3;

public class GatheringBoulders {

	public static void main(String[] args) {
		int array[] = { 1, 4, 5, 2, 10 };
		long value = new GatheringBoulders().gatheringCost(array.length, array);
		System.out.println(value);
	}

	public long gatheringCost(int n, int weightArr[]) {
		long minCost = Integer.MAX_VALUE, total = 0;
		long w = 0, c = 0;
		boolean state;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			total += weightArr[i];
		}
		for (int i = 1; i < n; i++) {
			temp = i;
			w = 0;
			c = 0;
			state=true;
			for (int j = 0; j < n; j++) {
				if (temp < 0) {
					temp = 1;
					state =false;
				}else if(temp>i) {
					temp=i;
				}
				c += (temp * weightArr[j]);
//				temp--;
				if(state) {
					temp--;
				}else {
					temp++;
				}
			}
			w = c + weightArr[i];
			if (c < minCost && w > total) {
				minCost = c;
			}
		}
		return minCost;
	}

}
